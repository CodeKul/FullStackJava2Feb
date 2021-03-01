package multithreading;

public class Sync {

    int num;

    public static void main(String[] args) throws InterruptedException {
        Sync sync = new Sync();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.show();
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    sync.show();
                }
            }
        });


        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
        System.out.println(sync.num);
    }

    public void show() {
        num++;
    }
}
