import java.util.Arrays;
public class maxProductOfThreeNumber {
    public static void main(String[] args) {
        int[] a ={1,2,3,-4,-5};
        System.out.println(maximumProduct(a));
       
    }

    public static int maximumProduct(int[] nums) {

    Arrays.sort(nums);
    return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        
    }

}
