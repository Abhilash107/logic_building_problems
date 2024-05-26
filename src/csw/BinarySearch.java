

public class BinarySearch {
    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Target found
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            } 
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Example usage with updated array elements
        int[] sortedArray = {1, 5, 8, 12, 20, 34, 55, 67, 89, 100};
        int target = 34;
        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

