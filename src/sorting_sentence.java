import java.util.Arrays;

public class sorting_sentence {
    public static void main(String[] args) {
        
        String s = "is2 sentence4 This1 a3";
        String str[] = s.split(" ");
        int arr[] = new int[s.length()];

        for (int i = 0; i < str.length; i++) {
            char c= str[i].charAt(str[i].length()-1);
            arr[i]= (int)c;
            
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
            
        }

       



        
    }

}
