public class toThePowerOfReverse {
    public static void main(String[] args) {
        System.out.println(power(12, 21));
        
    }

    public static long power(int N,int R)
    {
        int MOD = 1000000007;
        long result = (long) (Math.pow(N, R) % MOD);
        return result;        
    }

}
