public class ReverseString_01 {
    public static void main(String[] args) {
        String a = "  Hello   world1  ";
        String b = RevStr01(a);
        System.out.println(b);
        
        

        

    }

    public static String RevStr01(String s){

       
        String b = s.trim().replaceAll("\\s+", " ");
        String []c = b.split(" ");
        StringBuilder x = new StringBuilder();
    
        
        for(int i = c.length - 1; i >= 0; i--){
            x.append(c[i]);
            if(i > 0){
                x.append(" ");
            }
        }

        return x.toString();


        

    }

}
