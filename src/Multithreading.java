public class Multithreading {
    private static final Object lock = new Object();
    private static boolean turn = true;


    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        while (!turn) {
                            lock.wait();
                        }
                        System.out.println("1");
                        turn = false;
                        lock.notify();
                    }
                    Thread.sleep(500); // чтобы выводило в консоль не так быстро
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread secondThread = new Thread(() -> {
            try {
                while (true) {
                    synchronized (lock) {
                        while (turn) {
                            lock.wait();
                        }
                        System.out.println("2");
                        turn = true;
                        lock.notify();
                    }
                    Thread.sleep(500); // чтобы выводило в консоль не так быстро
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        firstThread.start();
        secondThread.start();
    }
}