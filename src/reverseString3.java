public class reverseString3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("let's make"));
        
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
        
        
    }

}
