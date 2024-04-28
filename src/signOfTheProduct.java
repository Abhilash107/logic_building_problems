public class signOfTheProduct {
    public static void main(String[] args) {
        
    }

    public static int arraySign(int[] nums) {

        int product =1;
        for (int i : nums) {
            product *= i;
        }

       
        return product;
        
        
    }

}
