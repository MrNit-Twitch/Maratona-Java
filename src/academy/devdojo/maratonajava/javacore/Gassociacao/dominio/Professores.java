package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professores {
    private String nome;
    private String especialidade01;
    private String especialidade02;
    private Seminarios seminarios;

    public Professores(String nome) {
        this.nome = nome;
    }
    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade01 = especialidade;
    }
    public Professores(String nome, String especialidade01, String especialidade02) {
        this.nome = nome;
        this.especialidade01 = especialidade01;
        this.especialidade02 = especialidade02;
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade01() {
        return especialidade01;
    }

    public void setEspecialidade01(String especialidade01) {
        this.especialidade01 = especialidade01;
    }

    public String getEspecialidade02() {
        return especialidade02;
    }

    public void setEspecialidade02(String especialidade02) {
        this.especialidade02 = especialidade02;
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }
}
