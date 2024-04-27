import java.util.Arrays;

public class typeOfTriangle {
    public static void main(String[] args) {
        int [] a= {5,3,8};
        System.out.println(triangleType(a));
        
    }
    public static String triangleType(int[] nums) {
        if(nums.length < 3){
            return "none";
        }

        if(nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[2] + nums[1] <= nums[0]  ){
            return "none";
        }

        if(nums[0] == nums[1] && nums[2] == nums[1] ){
            return "equilateral";
        }
        else if( nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
            return "isosceles";
        }
        else{
            return "scalene";
        }
        
    }

}
