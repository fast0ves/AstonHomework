import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

    private static Lock firstLock = new ReentrantLock();
    private static Lock secondLock = new ReentrantLock();

    public static void main(String[] args) {
        Deadlock deadLock = new Deadlock();
        new Thread(deadLock::firstOperation, "FirstThread").start();
        new Thread(deadLock::secondOperation, "SecondThread").start();
    }

    public void firstOperation() {
        firstLock.lock();
        System.out.println("firstLock acquired, waiting to acquire secondLock");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        secondLock.lock();
        System.out.println("secondLock acquired");
        System.out.println("executing firstOperation");
        secondLock.unlock();
        firstLock.unlock();
    }

    public void secondOperation() {
        secondLock.lock();
        System.out.println("secondLock acquired, trying to acquire firstLock");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firstLock.lock();
        System.out.println("firstLock acquired");
        System.out.println("executing secondOperation");
        firstLock.unlock();
        secondLock.unlock();
    }
}
