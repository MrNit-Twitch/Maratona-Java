package academy.devdojo.maratonajava.javacore.ZZEstreams.ZZFthreads.test;

class ThreadExample2 extends Thread {
    private final String c;

    public ThreadExample2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            //Thread.yield();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExample2("KA"));
        Thread t2 = new Thread(new ThreadExample2("ME"));
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
        /*Runnable example = () -> {

        };
        new Thread(example);*/
        /*new Thread(() -> {

        }).start();*/
    }
}
