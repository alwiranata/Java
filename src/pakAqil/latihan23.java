package pakAqil;

import java.util.Arrays;

public class latihan23 {
    
    // Bubble Sort
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Perbaikan di batas loop
                if (arr[j] > arr[j + 1]) { // Perbaikan kondisi sorting
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            } 
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Quick Sort
    public static void quickSort(int[] arr , int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Perbaikan pemanggilan metode
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low , int high) { // Perbaikan nama method
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high]; // Perbaikan kode
        arr[high] = temp;
        return i + 1;
    }
    
    public static void main (String[] args) {
        int[] arr = {64, 30, 25, 10, 11};
        
        // Bubble Sort
        int[] bubbleArr = Arrays.copyOf(arr, arr.length);
        bubbleSort(bubbleArr);
        System.out.println("Bubble Sort : " + Arrays.toString(bubbleArr));
        
        // Selection Sort
        int[] selectionArr = Arrays.copyOf(arr, arr.length);
        selectionSort(selectionArr);
        System.out.println("Selection Sort : " + Arrays.toString(selectionArr)); // Perbaikan output
        
        // Quick Sort
        int[] quickArr = Arrays.copyOf(arr, arr.length);
        quickSort(quickArr, 0, quickArr.length - 1); 
        System.out.println("Quick Sort : " + Arrays.toString(quickArr)); // Perbaikan output
    }
}
