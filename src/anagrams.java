import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String a="listen";
        String b= "silnt";

        if(a.length() !=b.length()){
            System.out.println("Nope");
            System.exit(0);
        }

        char c[] = a.toCharArray();
        char d[] = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        if (Arrays.equals(c,d)) {
            System.out.println("yayya"); 
        }





    }

}
