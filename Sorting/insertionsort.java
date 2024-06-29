import java.util.*;

public class insertionsort {

    public static void insertionSortexample(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = i;
            int prev = i - 1;

            //finding out the correct position
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            // insertion
            arr[prev + 1] = arr[curr];

        }
        printArr(arr);
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {54,5,66,6,63};
        insertionSortexample(arr);
    }
}