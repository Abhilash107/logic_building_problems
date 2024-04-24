import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list.add(a[i]);
            
        }
        for(int i=0;i<b.length;i++){
            list.add(b[i]);
            
        }

        System.out.println(list);

        int arr[] = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=a[i];
            arr[a.length+i]=b[i];
        }
        

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();

        

    }

}
