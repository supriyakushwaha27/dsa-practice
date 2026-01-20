import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        boolean isSwap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
                break;

        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 2 };
        System.out.println("before sort:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        bubbleSort(arr);

        System.out.println();
        System.out.println("after sort:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
