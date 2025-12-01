package MemoryOccupation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MemoryDemo {
    public static  void main(String []args){
        measureSetMemory("HashSet", new HashSet<>());
        measureSetMemory("LinkedHashSet", new LinkedHashSet<>());
        measureSetMemory("TreeSet", new TreeSet<>());
    }
    static void measureSetMemory(String name, Set<String> set) {
        Runtime rt = Runtime.getRuntime();
        rt.gc(); // encourage garbage collection
        long before = rt.totalMemory() - rt.freeMemory();
        for (int i = 0; i < 100000; i++) {
            set.add("Item" + i);
        }
        long after = rt.totalMemory() - rt.freeMemory();
        System.out.printf("%-15s memory used ≈ %,d bytes%n", name, (after - before));
    }
}
