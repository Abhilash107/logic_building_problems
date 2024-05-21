public class Bubble_Sort {
    
        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no elements were swapped in the inner loop, the array is sorted
                if (!swapped) {
                    break;
                }
            }
        }
    
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Unsorted array:");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
    
            bubbleSort(array);
    
            System.out.println("Sorted array:");
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
    


