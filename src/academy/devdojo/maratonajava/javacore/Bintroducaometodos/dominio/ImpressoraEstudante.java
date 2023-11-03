package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante) {
        System.out.println("---------------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

    public static class ImpressoraFuncionario {
        public void Imprimir(Estudante estudante){
            System.out.println("------------------------");
            System.out.println(estudante.nome);
            System.out.println(estudante.idade);
            //System.out.println(estudante.);
        }
    }
}
