public class reverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-200));
        
    }

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0; // Return 0 for overflow cases
            }
            x /= 10;

        }
        return (int) result;
    }
}
        
       
    