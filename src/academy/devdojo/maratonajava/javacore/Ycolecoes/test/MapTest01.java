package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>(); // Imprime na ordem do Hash (aleatorio)
        Map<String, String> map = new LinkedHashMap<>(); // Imprime na ordem de inserção
        map.put("teklado" , "teclado");
        map.put("mouze" , "mouse");
        map.put("vc" , "você");
        map.putIfAbsent("vc" , "você2"); // Se um valor estiver dobrado, ele subscreve o anterior"
        map.putIfAbsent("vc2" , "você2");
        System.out.println(map);
        System.out.println("--------------Key----------------");
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("--------------Value----------------");

        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("--------------ENTRY----------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
