public class stringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("-809"));
        
    }

    public static int myAtoi(String s) {
        int res =0; ;
        s = s.trim();
        for (int i = s.length()-1; i >=0; i--) {
            if( s.charAt(i) == '-'){
                res = res * -1;
            }

            // res = (int) (res + Integer.parseInt(s.charAt(i).toString()) * Math.pow(10, i)); 
        }

        return res;      
        
    }

}
