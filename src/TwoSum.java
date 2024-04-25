public class TwoSum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        int []  result = twoSum(a, 3);
        for (int i : result) {
            System.out.print(i+ " ");
            
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        if(nums.length!= 0){
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i] + nums[j]== target){
                        return new int[] {i , j};
                    }
                }
            }
        }

        return new int[]{-1 , -1};
    }

}
