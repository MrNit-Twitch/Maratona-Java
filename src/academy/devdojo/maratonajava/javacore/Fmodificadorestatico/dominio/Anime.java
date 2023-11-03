package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    0 - Bloco de inicialização é executado quando a JVM carrega a classe (sendo o bloco estatico executado antes do não estatico)
    1 - Alocado espaço em memória para o objeto
    2- cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    3 - Blococo de inicialização é executado
    4 - Construtor é executado
    */
    {
        System.out.println("Dento do bloco de inicialização NÂO estatico");
    }

    static {
        System.out.println("Dento do bloco de inicialização estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dento do bloco de inicialização estatico 2");
    }

    static {
        System.out.println("Dento do bloco de inicialização estatico 3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
