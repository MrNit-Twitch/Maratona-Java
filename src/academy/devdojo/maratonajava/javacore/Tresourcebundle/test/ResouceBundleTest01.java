package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        /*boolean existe = bondle.containsKey("hello");
        System.out.println(existe);*/
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));

    }
}
