package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraFuncionario {

    public void imprimir(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade() + " anos");
        double total = 0;
        for (int cont = 0; cont < funcionario.getSalario().length; cont++) {
            //A linha acima é igual a: (double cont : salario)
            System.out.println("Salario 0" + cont + ": R$" + funcionario.getSalario()[cont]);
            total += funcionario.getSalario()[cont];
        }
        funcionario.setMedia(total/funcionario.getSalario().length);
        System.out.println("Salário Total: R$" + total);
        System.out.println("\nMédia do Salario: R$" + funcionario.getMedia());
    }
}
