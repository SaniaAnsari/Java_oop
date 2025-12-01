package Arrays.asListVsString;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class JCF {
    public static void main(String []args){
        String[] arr = {"Zara", "Ali", "Bilal", "Nabeel"};
        List<String> names = Arrays.asList(arr);

        // Now you can do this:
        System.out.println(names.contains("Ali"));
        System.out.println(names.indexOf("Bilal"));
        Arrays.sort(arr);    // error collections.sort(arrArrays.sort(arr);
                            //Arrays.sort(array) → use for arrays (String[], int[], ...`).
                            //Collections.sort(list) → use for List<E> (e.g., ArrayList, LinkedList, or Arrays.asList(arr)).
        Collections.sort(names);
        Collections.sort(names);
        System.out.println(names);
    }
}
