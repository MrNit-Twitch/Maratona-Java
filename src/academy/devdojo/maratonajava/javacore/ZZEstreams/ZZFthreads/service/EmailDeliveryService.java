package academy.devdojo.maratonajava.javacore.ZZEstreams.ZZFthreads.service;

import academy.devdojo.maratonajava.javacore.ZZEstreams.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {

    }
}
