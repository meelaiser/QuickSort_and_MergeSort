public class MergeSort {

    public static void mergeSort(int[] arr) {

        // split if there are at least two values
        if (arr.length >= 2) {
            // split to create sub arrays
            int mid = arr.length / 2;

            // create left array
            int[] left = new int[mid];
            for (int a = 0; a < left.length; a++) left[a] = arr[a];
            // create right array
            int[] right = new int[arr.length - mid];
            for (int a = 0; a < right.length; a++) right[a] = arr[mid + a];

            // recursively sort sub arrays
            mergeSort(left);
            mergeSort(right);

            // merge sorted sub arrays
            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {

        // index to sort
        int left_index = 0;
        int right_index = 0;
        int result_index = 0;

        // sort util one sub array is finished
        while (left_index < left.length && right_index < right.length) {
            // compare two sub arrays
            if (left[left_index] < right[right_index]) {
                // sort array
                arr[result_index] = left[left_index];
                left_index++;
            } else {
                // sort array
                arr[result_index] = right[right_index];
                right_index++;
            }
            result_index++;
        }

        // merge all left array when right array is finished
        while (left_index < left.length) {
            arr[result_index] = left[left_index];
            left_index++;
            result_index++;
        }

        // merge all right array when left array is finished
        while (right_index < right.length) {
            arr[result_index] = right[right_index];
            right_index++;
            result_index++;
        }
    }

    public static void mergeSort(long[] arr) {

        // split if there are at least two values
        if (arr.length >= 2) {
            // split to create sub arrays
            int mid = arr.length / 2;

            // create left array
            long[] left = new long[mid];
            for (int a = 0; a < left.length; a++) left[a] = arr[a];
            // create right array
            long[] right = new long[arr.length - mid];
            for (int a = 0; a < right.length; a++) right[a] = arr[mid + a];

            // recursively sort sub arrays
            mergeSort(left);
            mergeSort(right);

            // merge sorted sub arrays
            merge(arr, left, right);
        }
    }

    private static void merge(long[] arr, long[] left, long[] right) {

        // index to sort
        int left_index = 0;
        int right_index = 0;
        int result_index = 0;

        // sort util one sub array is finished
        while (left_index < left.length && right_index < right.length) {
            // compare two sub arrays
            if (left[left_index] < right[right_index]) {
                // sort array
                arr[result_index] = left[left_index];
                left_index++;
            } else {
                // sort array
                arr[result_index] = right[right_index];
                right_index++;
            }
            result_index++;
        }

        // merge all left array when right array is finished
        while (left_index < left.length) {
            arr[result_index] = left[left_index];
            left_index++;
            result_index++;
        }

        // merge all right array when left array is finished
        while (right_index < right.length) {
            arr[result_index] = right[right_index];
            right_index++;
            result_index++;
        }
    }

    public static void mergeSort(String[] arr) {

        // split if there are at least two values
        if (arr.length >= 2) {
            // split to create sub arrays
            int mid = arr.length / 2;

            // create left array
            String[] left = new String[mid];
            for (int a = 0; a < left.length; a++) left[a] = arr[a];

            // create right array
            String[] right = new String[arr.length - mid];
            for (int a = 0; a < right.length; a++) right[a] = arr[mid + a];

            // recursively sort sub arrays
            mergeSort(left);
            mergeSort(right);

            // merge sorted sub arrays
            merge(arr, left, right);
        }
    }

    private static void merge(String[] arr, String[] left, String[] right) {

        // index to sort
        int left_index = 0;
        int right_index = 0;
        int result_index = 0;

        // sort util one sub array is finished
        while (left_index < left.length && right_index < right.length) {
            // compare two sub arrays
            if (left[left_index].compareToIgnoreCase(right[right_index]) < 0) {
                // sort array
                arr[result_index] = left[left_index];
                left_index++;
            } else {
                // sort array
                arr[result_index] = right[right_index];
                right_index++;
            }
            result_index++;
        }

        // merge all left array when right array is finished
        while (left_index < left.length) {
            arr[result_index] = left[left_index];
            left_index++;
            result_index++;
        }

        // merge all right array when left array is finished
        while (right_index < right.length) {
            arr[result_index] = right[right_index];
            right_index++;
            result_index++;
        }
    }
}
