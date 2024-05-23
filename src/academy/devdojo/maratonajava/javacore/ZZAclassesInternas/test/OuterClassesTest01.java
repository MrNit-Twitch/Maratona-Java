package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";
    //Nested Class

    class Inner {
        public void PrintOuterClassAttribte(){
            System.out.println(name);
            System.out.println(this); //referencia a propria classe (interna)
            System.out.println(OuterClassesTest01.this); //referencia a classe externa
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.PrintOuterClassAttribte();
        inner2.PrintOuterClassAttribte();
    }
}
