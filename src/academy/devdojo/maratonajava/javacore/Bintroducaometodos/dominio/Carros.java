package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Carros {
    //Criar 2 classes de Dominio (Carros e Impressora Carros)
    //Criar 1 classe de Teste (CarrosTeste)
    //Imprimir os dados de 2 carros (Nome, Modelo, Ano)
    public String nome;
    public String modelo;
    public int ano;

    public void imprimir (){
        System.out.println(this.nome);
        System.out.println(this.modelo);
        System.out.println(this.ano);
    }
}
