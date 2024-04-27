public class addDigits {
    public static void main(String[] args) {
        System.out.println(AddDigits(67));
        
    }
    

    public static int AddDigits(int num){
        if(num<10){
            return num;
        }
        int sum =0;
        // int temp = num;
        while(num!=0){
            sum += num%10;
            num /= 10;
        }
         if(sum>=10){
            num = sum;
            return AddDigits(num);
        }

        return sum;


    }

}
