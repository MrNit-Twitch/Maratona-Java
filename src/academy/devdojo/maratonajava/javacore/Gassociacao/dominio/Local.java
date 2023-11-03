package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;
    private Seminarios seminarios;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios() {
        this.seminarios = seminarios;
    }

}
