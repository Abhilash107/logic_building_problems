public class mergeStringAlternately {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));

       


        
        
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i<word1.length()){
                str.append(word1.charAt(i));
        
            }
            if(i<word2.length()){
                str.append(word2.charAt(i));
        
            }
            i++;
        }
        
        
    
        return str.toString();
       
    }

}
