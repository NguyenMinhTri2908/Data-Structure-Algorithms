public class LinearSearch {


    public static int search(int[] arr, int target) {
        // Loop through every element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }
        // Target was not found after checking the whole array
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 1, 8, 4, 9, 3};
        int targetToFind = 8;

        int resultIndex = search(numbers, targetToFind);

        if (resultIndex != -1) {
            System.out.println("Element " + targetToFind + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetToFind + " not found in the array.");
        }

        targetToFind = 7;
        resultIndex = search(numbers, targetToFind);

        if (resultIndex != -1) {
            System.out.println("Element " + targetToFind + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + targetToFind + " not found in the array.");
        }
    }
}