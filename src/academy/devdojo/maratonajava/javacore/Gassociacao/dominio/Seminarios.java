package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminarios {
    private String nome;
    private Professores professores;
    private Estudantes[] estudantes;
    private Local local;

    public Seminarios(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.print("Seminarios: ");
        System.out.println(this.nome);
        System.out.print("Professor: ");
        System.out.println(this.professores.getNome());
        System.out.println("Alunos: ");
        if (estudantes == null){
            System.out.println("Não ouveram alunos cadastrados");
        } else {
            for (Estudantes estudante : estudantes) {
                System.out.println("Aluno 01: " + estudante.getNome());
            }
        }
        System.out.print("Local: ");
        System.out.println(this.local.getEndereco());
        System.out.println("_________________________________");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
