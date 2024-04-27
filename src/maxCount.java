public class maxCount {
    public static void main(String[] args) {
        int[] a = {-3,-2 ,-1,0,0,3};
        System.out.println(maximumCount(a));
        
    }

    public static int maximumCount(int[] nums) {
        int c=0;
        int z =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                c++;
            }
            else if(nums[i] == 0){
                z++;
            }  
        }

        if(nums.length - (c+z) > c){
            return nums.length - (c+z);
        }

        return c;
        
    }

}
