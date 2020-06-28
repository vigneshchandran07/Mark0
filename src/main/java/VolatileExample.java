public class VolatileExample implements Runnable {
    private volatile int i;

    public static void main(String[] args) {
        VolatileExample volatileTest = new VolatileExample();
        while (true) {
            Thread t1 = new Thread(volatileTest, "Thread1");
            Thread t2 = new Thread(volatileTest, "Thread2");
            t1.start();
            t2.start();
        }
    }

    public void run() {
        int count = 0;
        if (Thread.currentThread().getName().equals("Thread2")) {
            System.out.println(Thread.currentThread().getName() + ": Value of i is " + i);
        } else {
            i++;
            System.out.println(Thread.currentThread().getName() + ": Value of i changed to " + i);
        }
    }

    private void sleepSafe(long sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}