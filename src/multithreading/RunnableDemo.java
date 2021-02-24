package multithreading;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().isAlive());
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"T1");
        
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().isAlive());
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Exit");

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

    }
}
