package Lexicographic;

public class lexicoexample {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "app";

        System.out.println(s1.compareTo(s2)); // negative → apple < banana
        System.out.println(s1.compareTo(s3)); // positive → apple > app
        System.out.println(s2.compareTo("banana")); // 0 → equal
    }


}
