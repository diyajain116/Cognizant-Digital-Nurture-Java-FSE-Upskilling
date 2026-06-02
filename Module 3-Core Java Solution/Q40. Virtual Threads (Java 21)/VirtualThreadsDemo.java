public class VirtualThreadsDemo {

    public static void main(String[] args) throws InterruptedException {

        int numberOfThreads = 100000;

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= numberOfThreads; i++) {

            int threadNumber = i;

            Thread.startVirtualThread(() -> {
                System.out.println(
                        "Virtual Thread " +
                        threadNumber +
                        " is running"
                );
            });
        }

        long endTime = System.currentTimeMillis();

        System.out.println(
                "\nCreated " +
                numberOfThreads +
                " virtual threads in " +
                (endTime - startTime) +
                " ms"
        );

        Thread.sleep(2000);
    }
}
