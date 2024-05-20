import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("poop", "oopp"));
        
    }

    public static boolean isAnagram(String s, String t) {
        if( s.length() != t.length() )  {
            return false;
        }
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);

    }

}
