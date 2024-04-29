public class xorOperation {
    public static void main(String[] args) {
       System.out.println(XorOperation(5,0));
       System.out.println(XorOperation(4,3));
        
    }

    public static int XorOperation(int n, int start) {
        int[] nums = new int[n];
        int result = 0;
        for(int i =0;i<nums.length;i++){
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }

        return result;
        
    }

}
