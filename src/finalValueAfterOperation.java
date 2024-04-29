public class finalValueAfterOperation {
    public static void main(String[] args) {
        String[] s = {"++X","X--","++X","X++"};
        System.out.println(finalValAftOps(s));
        
    }

    public static int finalValAftOps(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                res++;
            }
            else if(operations[i].equals("--X") || operations[i].equals("X--")){
                res--;
            }    
        }

        return res;
    }

}
