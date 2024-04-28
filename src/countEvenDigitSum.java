public class countEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(countEven(2));  
    }

    public static int countEven(int num) {
        int c=0;  //1ms
        for (int i = 2; i <=num; i++) {
            if(isEven(i)){
                c++;
            }   
        }
        return c++;

    }

    public static boolean isEven(int temp) {
        int sum =0;
        
        while(temp!= 0){
            sum += temp%10;
            temp/=10;
        }
        if(sum%2 == 0){
            return true;
        }

        return false;
          
    }

    // public int countEven(int num) {   // an unique approach 0ms
    //     if(sumOfDigits(num) % 2 == 0) return num/2;
    //     else return (num-1)/2;
    // }       

}
