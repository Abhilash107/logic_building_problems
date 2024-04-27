public class diffrenceOfSums {
    public static void main(String[] args) {
        int [] a = {1,15,6,3};
        System.out.println(differenceOfSum(a));
        
    }

    public static int differenceOfSum(int[] nums) {
        int sum1 =0; int sum2 = 0;
        for (int i : nums) {
            sum1+=i;
        }
        for (int i : nums) {
            sum2+=digits(i);
        }

        return sum1 -sum2;


        
    }

    public static int digits(int x) {
        int sum =0;
        int temp = x;

        while(temp!= 0){
            sum += temp%10;
            temp/=10;
        }
        
        return sum;
    }

}
