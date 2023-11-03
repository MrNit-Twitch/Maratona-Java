package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
        /*
    0 - Bloco de inicialização estatico da super classe é executado quando a JVM carrega a super classe
    1 - Bloco de inicialização estatico da classe herdeira é executado quando a JVM carrega a classe herdeira
    2 - Alocado espaço em memória para o objeto da super classe
    3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado da super classe
    4 - Blococo de inicialização da super classe é executado na ordem em que aparece
    5 - Construtor da super classe é executado
    6 - Alocado espaço em memória para o objeto da classe herdeira
    7 - Cada atributo da classe herdeira é criado e inicializado com valores default ou o que for passado da classe herdeira
    8 - Blococo de inicialização da classe herdeira é executado na ordem em que aparece
    9 - Construtor da classe herdeira é executado
    */
    }
}
