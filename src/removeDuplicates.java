import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] a = {1,1,2};
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(unique.contains(a[i])){
                duplicate.add(a[i]);
            }
            else{
                unique.add(a[i]);
            }
        }

        System.out.println(duplicate.size());

        System.out.println(unique.size());


    }

}
