package Hashing;
import java.util.*;
public class HashSetBasic {
    public static void main(String[] args) {
        HashSet name=new HashSet();

        name.add("Nitish");
        name.add("Suman");
        name.add("Vidyavati");
        name.add("Basavaraj");
        name.add("Arali");
        System.out.println(name);

        name.remove("Arali");
        System.out.println(name);

        System.out.println(name.contains("Nitish"));
        System.out.println(name.contains("Arali"));
        System.out.println(name.size());

    }
}
