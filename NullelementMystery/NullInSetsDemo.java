package NullelementMystery;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NullInSetsDemo {
    public static void main(String[]args){
        // HashSet allows one null
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add("Ali");
        hashSet.add(null);
        System.out.println("HashSet: " + hashSet);
// LinkedHashSet allows one null and keeps order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ali");
        linkedHashSet.add(null);
        linkedHashSet.add("Bilal");
        System.out.println("LinkedHashSet: " + linkedHashSet);
// TreeSet does NOT allow null
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ali");
        try {
            treeSet.add(null); // will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("TreeSet: cannot add null (throws exception)");
        }
    }
}


