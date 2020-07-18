package MultithreadProgramming;

public class DemoThread {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread is interrupted..");

        }
        System.out.println("Exiting Main Thread..");
    }

}
