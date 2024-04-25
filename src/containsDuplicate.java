import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,4};


    }

    public boolean checkDuplicate(int[] nums) {

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if(unique.contains(nums[i])){
                duplicate.add(nums[i]);
            }
            else{
                unique.add(nums[i]);
            }  
        }

        if(duplicate.size() != 0){
            return true;
        }

        return false;

      

        
    }



}
