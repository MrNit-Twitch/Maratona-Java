package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 739959230178355186L;
    private Long id;
    private String nome;
    private transient String password;
    private static String NOME_ESCOLA = "DevDojo";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma("nome turma");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}' + "NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                '}' + "turma='" + turma + '\'';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return NOME_ESCOLA;
    }

    public static void setNomeEscola(String nomeEscola) {
        NOME_ESCOLA = nomeEscola;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
