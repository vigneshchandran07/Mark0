public class Problem10 {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello");
        try {
            scheduler(runnable,1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void scheduler(Runnable runnable, int n) throws InterruptedException {
        while (true) {
            Thread.sleep(n);
            runnable.run();
        }
    }
}


