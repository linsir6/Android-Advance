package attention;

import java.util.concurrent.Semaphore;

public class TwoThreadPrintNumberV2 {

    private static Semaphore s1 = new Semaphore(1);
    private static Semaphore s2 = new Semaphore(0);
    private static int count = 0;

    private static void printABC(Semaphore currentThread, Semaphore nextThread) {
        for (int i = 0; i < 5; i++) {
            try {
                currentThread.acquire();
                System.out.println(count++ + "   " + Thread.currentThread().getName());
                nextThread.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> printABC(s1, s2), "A").start();
        new Thread(() -> printABC(s2, s1), "B").start();
    }

}
