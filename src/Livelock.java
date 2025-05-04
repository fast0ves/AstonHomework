import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Livelock {
    private final Lock firstLock = new ReentrantLock();
    private final Lock secondLock = new ReentrantLock();

    public static void main(String[] args) {
        Livelock livelock = new Livelock();

        new Thread(livelock::firstOperation, "firstThread").start();
        new Thread(livelock::secondOperation, "secondThread").start();
    }

    public void firstOperation() {
        while (true) {
            try {
                firstLock.tryLock(1000, TimeUnit.MILLISECONDS);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (secondLock.tryLock()) {
                System.out.println("secondLock acquired");
            } else {

                System.out.println("secondLock can't be acquired, releasing firstLock");
                firstLock.unlock();
                continue;
            }
            System.out.println("executing firstOperation");
            break;
        }
        secondLock.unlock();
        firstLock.unlock();
    }

    public void secondOperation() {
        while (true) {
            try {
                secondLock.tryLock(1000, TimeUnit.MILLISECONDS);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("secondLock acquired, trying to acquire firstLock");
            if (firstLock.tryLock()) {
                System.out.println("firstLock acquired");
            } else {
                System.out.println("firstLock can't be acquired, releasing secondLock");
                secondLock.unlock();
                continue;
            }
            System.out.println("executing secondOperation");
            break;
        }
        firstLock.unlock();
        secondLock.unlock();
    }
}