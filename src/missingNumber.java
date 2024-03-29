import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        int[] a = {2,3,4,1,6,7};
        Arrays.sort(a);
        int b = 1;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b){
                System.out.println("Missing number: "+ b);
                break;  
            }
            b++;
        }
        
    }

}
