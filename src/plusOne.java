public class plusOne {
    public static void main(String[] args) {
        int[] a= {9};
       
        String str = "";
        for(int i=0;i<a.length;i++){
            str += a[i];
        }

        long x =(long) Integer.parseInt(str)+1;
        String str2 = Long.toString(x);

        int[] arr = new int[str2.length()];
        for(int i=0;i<arr.length;i++){
            char ch = str2.charAt(i);
            int digit = Character.getNumericValue(ch);

            arr[i] = digit;
        }

        for (int i : arr) {
            System.out.print(i+" ");
            
        }


    }

}
