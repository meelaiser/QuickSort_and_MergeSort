import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {

        // split if there are at least two values
        if (start < end) {
            // use random value in array as pivot value
            Random random = new Random();
            int pivot_index = random.nextInt(end - start) + start;

            // put pivot value to last index to sort
            int tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // index for pivot
            pivot_index = start;
            // sort partition
            for (int index = start; index < end; index++) {
                // compare with pivot
                if (arr[index] < arr[end]) {
                    // put smaller value before pivot
                    tmp = arr[pivot_index];
                    arr[pivot_index] = arr[index];
                    arr[index] = tmp;

                    pivot_index++;
                }
            }

            // put pivot value back to pivot index
            tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // recursively sort partitions
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }
    }

    public static void quickSort(long[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(long[] arr, int start, int end) {

        // split if there are at least two values
        if (start < end) {
            // use random value in array as pivot value
            Random random = new Random();
            int pivot_index = random.nextInt(end - start) + start;

            // put pivot value to last index to sort
            long tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // index for pivot
            pivot_index = start;
            // sort partition
            for (int index = start; index < end; index++) {
                // compare with pivot
                if (arr[index] < arr[end]) {
                    // put smaller value before pivot
                    tmp = arr[pivot_index];
                    arr[pivot_index] = arr[index];
                    arr[index] = tmp;

                    pivot_index++;
                }
            }

            // put pivot value back to pivot index
            tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // recursively sort partitions
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }
    }

    public static void quickSort(String[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(String[] arr, int start, int end) {

        // split if there are at least two values
        if (start < end) {
            // use random value in array as pivot value
            Random random = new Random();
            int pivot_index = random.nextInt(end - start) + start;

            // put pivot value to last index to sort
            String tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // index for pivot
            pivot_index = start;
            // sort partition
            for (int index = start; index < end; index++) {
                //                                                                                                                                                                                                                                                                              compare with pivot
                if (arr[index].compareToIgnoreCase(arr[end]) < 0) {
                    // put smaller value before pivot
                    tmp = arr[pivot_index];
                    arr[pivot_index] = arr[index];
                    arr[index] = tmp;

                    pivot_index++;
                }
            }

            // put pivot value back to pivot index
            tmp = arr[pivot_index];
            arr[pivot_index] = arr[end];
            arr[end] = tmp;

            // recursively sort partitions
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, end);
        }
    }
}

