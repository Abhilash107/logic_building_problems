public class reverse_modified {
    public static void main(String[] args) {
        String S="i.like.you";
        String []str = S.split("\\.");
        String newSTR = "";

        for(int i=str.length-1;i>=0;i--){
            newSTR += str[i];
            if(i>0){
                newSTR += ".";
            }
            
            
        }
        System.out.println(newSTR);
    }

}
