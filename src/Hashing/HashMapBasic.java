package Hashing;
import java.sql.SQLOutput;
import java.util.HashMap;
public class HashMapBasic {
    public static void main(String[] args) {
        HashMap <String,Integer> Population= new HashMap<>();
        Population.put("India",130);
        Population.put("China",150);
        Population.put("USA",30);
        Population.put("France",5);
        System.out.println(Population);

        Population.remove("France",5);
        System.out.println(Population);

        System.out.println(Population.get("USA"));
        System.out.println(Population.containsKey("India"));
        System.out.println(Population.size());




    }
}
