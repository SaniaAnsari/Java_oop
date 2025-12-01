package List;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String []args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.add(2,70);
        System.out.println("after adding element at specific index "+list);

        System.out.println("return element "+list.get(3));
        list.set(1,35);
        System.out.println("replace element "+list);

        System.out.println("true or false ? "+list.contains(70));

        System.out.println(list.isEmpty());

        System.out.println("return index "+ list.indexOf(35));

        list.remove(3);
        System.out.println("list after removing "+list);

        System.out.println("list size "+list.size());

        list.clear();
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println("the element is "+list.get(i));
        }
        for(Integer element:list){
            System.out.println("for-each element is "+element);
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }
    }
}
