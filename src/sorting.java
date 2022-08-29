//import java.util.Arrays;
//
//public class sorting {
//    static int[] nums = {4, 7, 123, 7, 4, 12, 87, 434, 1234};
//    public static void main(String[] args) {
//
//        int one = 0;
//        int two = 9;
//
//        insertionSort(nums, one, two);
//    }
//
//    public static void insertionSort(int[] nums) {
//        for(int i = 0; i < nums.length; i++) {
//            int valueToSort = nums[i];
//            int j;
//            for(j = i; j > 0 && nums[j - 1] < valueToSort; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[j] = valueToSort;
//        }
//        System.out.println(Arrays.toString((nums)));
//    }
//
//    public static void selectionSort(int[] nums) {
//        for(int i = 0; i < nums.length - 1; i++) {
//            int index = i;
//
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[j] < nums[index]) {
//                    index = j;
//                }
//            }
//
//            int smallerNumber = nums[index];
//            nums[index] = nums[i];
//            nums[i] = smallerNumber;
//      }
//        System.out.println(Arrays.toString((nums)));
//
//    }
//
////    public static void mergeSort(int[] nums, int start, int end) {
////       int mid = (start + end) / 2;
////
////       if(start < end) {
////
////           mergeSort(start, mid);
////
////           mergeSort(mid + 1; end);
////
////           merge(start, mid, end, nums);
////
////       }
////
////    }
//
//    private static void merge(int start, int mid, int end) {
//        int[] tempArray = new int[nums.length];
//        int tempArrayIndex = start;
//
//        int startIndex = start;
//        int midIndex = mid + 1;
//
//        while(startIndex <= mid && midIndex <= end) {
//            if(nums[startIndex] < nums[midIndex]) {
//                tempArray[tempArrayIndex] = nums[startIndex++];
//            } else {
//                tempArray[tempArrayIndex] = nums[midIndex++];
//            }
//        }
//
//        while(startIndex <= mid) {
//            tempArray[tempArrayIndex++] = nums[startIndex++];
//        }
//
//        while(midIndex <= end) {
//            tempArray[tempArrayIndex] = nums[midIndex++];
//        }
//
//        if(end + 1- start >= 0) {
//            System.arraycopy(tempArray, start, nums, start, end + 1 - start);
//        }
//    }
//
//    //OBJECT ORIENTED PROGRAMMING
//    // OBJECT
//    // INHERITANCE - sharing of behaviour between classes
//    // ENCAPSULATION -
//    // ABSTRACTION
//    // Polymorphism -
//    // Attribute
//    // Method
//    // Class
//
//
//
//}
