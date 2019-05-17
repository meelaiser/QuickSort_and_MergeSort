public class Main {

    public static void main(String args[]) {

        //-- modify array length to test --//
        int[] arrayLength = new int[]{
            0, 1, 1000, 2000, 3000, 4000, 5000};
        int testArrayLength = arrayLength[5];

        //-- uncomment data type to get test array --//
//        long[] arr = LibraryData.getISBN(testArrayLength);
        String[] arr = LibraryData.getBookTitle(testArrayLength);
//        String[] arr = LibraryData.getBookAuthor(testArrayLength);
//        int[] arr = LibraryData.getPublicationYear(testArrayLength);
//        String[] arr = LibraryData.getPublisher(testArrayLength);

        //-- choose sorting method to test sorting --//
        String[] sortMethod = new String[]{
            "QuickSort", "MergeSort" };
//        for(int a = 0; a < 6; a++)
            sort(arr, sortMethod[1]);
    }

    private static void sort(int[] arr, String sortMethod){

        // print array before sort
        System.out.println("\n" + sortMethod + "started.");
        System.out.println("Array length: " + arr.length);

        // sort unsorted array
        System.out.println("Sorting unsorted array......");

        // start timing
        System.gc();
        double startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.println("Please Choose a existing sorting method.");
        }

        // stop timing
        double endTime = System.nanoTime();
        double timeDuration = endTime - startTime;

        // print array after sort
        System.out.print("Sorting finished in " + timeDuration + " nanoseconds.\n");

        // sort sorted array
        System.out.println("Sorting sorted array......");

        // start timing
        System.gc();
        startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.print("Please Choose a existing sorting method.");
        }

        // stop timing
        endTime = System.nanoTime();
        timeDuration = endTime - startTime;

        // print array after sort
        System.out.println("Sorting finished in " + timeDuration + " nanoseconds.");
    }

    private static void sort(long[] arr, String sortMethod){

        // print array before sort
        System.out.println("\n" + sortMethod + "started.");
        System.out.println("Array length: " + arr.length);

        // sort unsorted array
        System.out.println("Sorting unsorted array......");

        // start timing
        System.gc();
        double startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.println("Please Choose a existing sorting method.");
        }

        // stop timing
        double endTime = System.nanoTime();
        double timeDuration = endTime - startTime;

        // print array after sort
        System.out.println("Sorting finished in " + timeDuration + " nanoseconds.");

        // sort sorted array
        System.out.println("Sorting sorted array......");

        // start timing
        System.gc();
        startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.print("Please Choose a existing sorting method.");
        }

        // stop timing
        endTime = System.nanoTime();
        timeDuration = endTime - startTime;

        // print array after sort
        System.out.println("Sorting finished in " + timeDuration + " nanoseconds.");
    }

    private static void sort(String[] arr, String sortMethod){

        // print array before sort
        System.out.println("\n" + sortMethod + "started.");
        System.out.println("Array length: " + arr.length);


        System.out.println("");
        System.out.println("");
        System.out.println("\nBefore:");
        for(int a = 0; a < arr.length; a++)
//        for(int a = 0; a < 10; a++)
            System.out.println(arr[a] + ", ");
        System.out.println("");
        System.out.println("");

        // sort unsorted array
        System.out.println("Sorting unsorted array......");

        // start timing
        System.gc();
        double startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.println("Please Choose a existing sorting method.");
        }

        // stop timing
        double endTime = System.nanoTime();
        double timeDuration = endTime - startTime;

        // print array after sort
        System.out.println("Sorting finished in " + timeDuration + " nanoseconds.");

        System.out.println("");
        System.out.println("");
        System.out.println("After:");
        for(int a = 0; a < arr.length; a++)
//        for(int a = 0; a < 10; a++)
            System.out.println(arr[a] + ", ");
        System.out.println("");
        System.out.println("");

        // sort sorted array
        System.out.println("Sorting sorted array......");

        // start timing
        System.gc();
        startTime = System.nanoTime();

        // start sorting
        switch (sortMethod){
            case "QuickSort":
                QuickSort.quickSort(arr);
                break;
            case "MergeSort":
                MergeSort.mergeSort(arr);
                break;
            default:
                System.out.print("Please Choose a existing sorting method.");
        }

        // stop timing
        endTime = System.nanoTime();
        timeDuration = endTime - startTime;

        // print array after sort
        System.out.println("Sorting finished in " + timeDuration + " nanoseconds.");
    }
}
//        System.out.println("\nBefore:");
//        for(int a = 0; a < arr.length; a++)
//            System.out.println(arr[a] + ", ");
//        System.out.println("After:");
