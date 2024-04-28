public class alternateSum {
    public static void main(String[] args) {
        int a = 521
        ;
        
        System.out.println(alternateDigitSum(a));
        
    }
    public static int alternateDigitSum(int n) {
        String digit = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<digit.length(); i++){
            int d = digit.charAt(i)-'0';
            if(i%2==0){
                sum += d;
            }else{
                sum -= d;
            }
        }
        return sum;
    
        
    }

}
