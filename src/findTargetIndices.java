import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTargetIndices {
    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 4, 5, 4};; 
        int target = 4;
        List<Integer> result = targetIndices(nums, target);
        System.out.println("Indices of target value " + target + ": " + result);
        
        
        
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;int mid;

        while(i<=j){
            mid = i + (j-i)/2;
            if(nums[mid] == target){
                list.add(mid);

                int left = mid - 1;
                while (left >= 0 && nums[left] == target) {
                    list.add(left);
                    left--;
                }
                
                int right = mid + 1;
                while (right < nums.length && nums[right] == target) {
                    list.add(right);
                    right++;
                }
                return list;
            }
            else if(nums[mid]> target){
                j = mid-1;
            }
            else{
                i = mid+1;
            }

        }

        return Arrays.asList(-1);


        
        
        
    }

}
