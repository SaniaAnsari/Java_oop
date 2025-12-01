package JavaCollectionFramework;
import java.util.List;
import java.util.*;

public class JCF {
    public static void  main(String[]args){
        Set <String> hashSet=new HashSet<>();
        Set <String> linkedhashSet=new LinkedHashSet<>();
        Set <String> treeSet=new TreeSet<>();
        Map <String,Integer> hashmap=new HashMap<>();

        List<String>names=Arrays.asList("Sania","Ayesha","Laiba","Zoha");
        for (String name : names) {
            hashSet.add(name);
            linkedhashSet.add(name);
            treeSet.add(name);
            hashmap.put(name, name.length());
        }
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedhashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("HashMap: " + hashmap);

    }
}
