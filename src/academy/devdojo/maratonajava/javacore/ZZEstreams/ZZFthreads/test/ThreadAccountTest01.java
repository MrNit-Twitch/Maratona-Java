package academy.devdojo.maratonajava.javacore.ZZEstreams.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account(); // colocar como final caso coloque o Sync dentro da classe

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
            if (account.getBalance() < 0){
                System.out.println("LASCOU");
            }
        }
    }

    private synchronized void withdraw(int amount){
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        // System.out.println(getThreadName()) + " #### fora do synchronized";
        //synchronized (account) {} "colocar o codigo a baixo no bloco do Sync
        if (account.getBalance() >= amount){
            // System.out.println(getThreadName()) + " **** dentro do synchronized";
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            account.withdraw(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar saque " + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
