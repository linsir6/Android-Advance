package attention;

import java.util.concurrent.locks.ReentrantLock;

public class TwoThreadPrintNumber {

    static class MyThread extends Thread {

        int a;

        public MyThread(int a){
            this.a = a;
        }

        static ReentrantLock lock = new ReentrantLock();
        static int i = 0;

        @Override
        public void run() {
            super.run();

            while (true) {

                lock.lock();
                if (i >= 10){
                    lock.unlock();
                    break;
                }

                if (i % 2 == a) {
                    System.out.println(i + "    " + this);
                    i++;
                }
                lock.unlock();


            }

        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread(0);
        MyThread thread2 = new MyThread(1);
        thread.start();
        thread2.start();
    }

}
