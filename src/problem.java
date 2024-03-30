public class problem{
    public static void main(String[] args) {
        int[] a= {1,2,1,4,9,2};

        if(a.length==0){
            System.exit(0);
        }
        if(a.length ==1){
            System.out.println(a[0]);
        }

        
            int sum1 =0;
            int sum2= 0;

            for(int i=0;i<a.length;i++){
                sum1+=a[i];
              

            }


            for(int j=0;j<a.length;j++){
                sum1-=a[j];

                if(sum2==sum1){
                    System.out.println(a[j]);
                    System.exit(0);;
                }
                sum2+=a[j];

            }
            System.out.println("Nope");
           

        


    }
}