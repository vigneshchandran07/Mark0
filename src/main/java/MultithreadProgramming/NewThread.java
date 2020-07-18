package MultithreadProgramming;

public class NewThread implements Runnable {
    Thread thread;

    NewThread() {

        thread = new Thread(this, "Demo Thread");
        thread.setPriority(10);
        System.out.println("Child Thread : " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {

            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting Child Thread..");

    }
}
