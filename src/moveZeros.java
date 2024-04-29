import java.util.Arrays;
import java.util.Collections;

public class moveZeros {
    public static void main(String[] args) {
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        moveZero(arr);
        
    }

    public static void moveZero(Integer[] nums) {
        Arrays.sort(nums, Collections.reverseOrder());
        for (Integer integer : nums) {
            System.out.print(integer+ " ");
        }
        
    }

}
