import java.util.Arrays;

public class findDiffrence {
    public static void main(String[] args) {

        System.out.println(findTheDifference("","w"));
        
    }
    public static char findTheDifference(String s, String t) {

        if(s.length() >= t.length()){
           System.exit(0);
        }

        int j=0;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str1);

        for (int i = 0; i < str2.length; i++) {
            if(s.length()==0){
                return (char)str2[0];
            }
            if(j==str1.length-1){
                return (char)str2[str2.length-1];
            }

            if(str2[i]!=str1[j]){
                return (char)str2[i];
            }else{
                j++;
            }
  
        }
        
        return (char)str2[str2.length-1];



        //
        // 
        //

        // int i = str1.length-1;
        // int j = str1.length-1;
        
    }

}
