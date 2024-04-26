import java.util.Arrays;

public class findDiffrence {
    public static void main(String[] args) {
        System.out.println(findTheDifference("", "a"));
    


        
        
    }
    public static char findTheDifference(String s, String t) {

        if(s.length()==0){
            return t.charAt(0);
        }

        long s1 = 0;
        long t1 = 0;

        for (int i = 0; i < s.length(); i++) {
            s1 += (long)s.charAt(i); 
        }

        for (int i = 0; i < t.length(); i++) {
            t1 += (long)t.charAt(i); 
        }
        


       return  (char) ((char) t1-s1);
        
    }

}
