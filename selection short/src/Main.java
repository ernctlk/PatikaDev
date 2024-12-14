public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Print the array at each step
            System.out.println("Step " + (i + 1) + ":");
            printArray(arr);

            // Stop after 4 steps for this example
            if (i == 3) break;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
