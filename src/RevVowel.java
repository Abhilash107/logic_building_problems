public class RevVowel {
    public static void main(String[] args) {
        String a = "leetcode" ;
        String b =a.toLowerCase();
        String c ="aeiou";

        StringBuilder str = new StringBuilder(b);

       

        int i=0;
        int j=b.length()-1;
        

        while(i<=j){
            if(c.contains(Character.toString(b.charAt(i))) && c.contains(Character.toString(b.charAt(j)))){
                if(b.charAt(i) != b.charAt(j)){
                    // str.insert(i, b.charAt(j));
                    // str.insert(j, b.charAt(i));

                    str.setCharAt(i, b.charAt(j));
                    str.setCharAt(j, b.charAt(i));

                    break;

                    
                    

                }
                else{
                    i++;j--;
                }
                
            }
            else if (!c.contains(Character.toString(b.charAt(i)))) {
                // Move i forward
                i++;
            } else if (!c.contains(Character.toString(b.charAt(j)))) {
                // Move j backward
                j--;
            }
        }
        System.out.println(str.toString());
            
    }

}
