import java.util.Arrays;

public class smallestPositive {
    public static void main(String[] args) {
        int[] a= {1,-1,4,9,2};
        Arrays.sort(a);
        int counter =1;
        for (int i = 0; i < a.length; i++) { 
            if (a[i] > 0 && a[i] == counter) {
                counter++;
            }
        }
        System.out.println(counter);
        
    }
    
}
