public class fisrtPalindrome {
    public static void main(String[] args) {
        String[] s = {"abc","car","ada","racecar","cool"};
        System.out.println(CheckfirstPalindrome(s));
        
    }

    public static String CheckfirstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])){
                return words[i];
            }
            
        }

        return "";

        
    }

    public static boolean isPalindrome(String s){

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        
        return true;

    }

}
