package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //Sequencia de proteção: private -> defaul -> protected -> public
    public static final int MAX_DATA_SIZE = 10;
    void load(); //Todo metodo em interface é "public abstract", Ex: public abstract void load();
    default void checkPermission(){}; //Porem, posso criar um metodo "defaul void",
    // porem este metodo não é abstrato, não sento obrigatorio a implementação dele nas classes implementadas.
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
