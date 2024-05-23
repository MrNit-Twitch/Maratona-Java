package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void  print (final String param){
        final String lastName = "Izuku";
        class LocalCalss {
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalCalss().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        //outer.print();
    }
}
