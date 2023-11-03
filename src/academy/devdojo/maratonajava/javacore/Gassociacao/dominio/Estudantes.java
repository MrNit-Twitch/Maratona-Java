package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import academy.devdojo.maratonajava.javacore.Gassociacao.test.SeminariosTest01;

public class Estudantes {
    private String nome;
    private int idade;
    private  Seminarios[] seminarios;


    public Estudantes(String nome) { this.nome = nome;}
    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Estudantes(String nome, int idade, Seminarios[] seminarios) {
        this.nome = nome;
        this.idade = idade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
        for (Seminarios seminario: seminarios) {
            System.out.println(seminario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }
}
