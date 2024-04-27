public class palindromeNumber {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        int x =  121;
        System.out.println(isPalindrome(x));
        
        
    }
    public static boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
            
        }
        return true;
    
        
    }

}
