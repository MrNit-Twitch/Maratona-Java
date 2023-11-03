package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    /*
    1 - Alocado espaço em memória para o objeto
    2- cada atributo de classe é criado e inicializado com valores default ou o quer for passado
    3 - Blococo de inicialização é executado
    4 - Construtor é executado
    */
    {
        System.out.println("Dento do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {
        for (int episodios : this.episodios) {
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
