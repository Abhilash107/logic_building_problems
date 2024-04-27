public class harshadNumber {
    public static void main(String[] args) {
        System.out.println(sumOfTheDigitsOfHarshadNumber(10));
        
    }
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int temp = x;

        while(temp!= 0){
            sum += x%10;
            temp/=10;
        }
        if(sum!= 0 && x % sum == 0){
            return x % sum;
        }
        return -1;
    }

}
