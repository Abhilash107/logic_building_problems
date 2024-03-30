import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        Arrays.sort(a);
        int b = 1;
        for(int i=0;i<a.length;i++){
            if(a[i] == b){
                b++;
            }else{
                System.out.println(b);
                System.exit(0);
            }
           
        }

        
    }

}
