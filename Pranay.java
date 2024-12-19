import java.util.*;
 class SortArray {
     int[] arr;
     int size;
    
    // Constructor to allocate memory for the array of n size
    public SortArray(int n) {
        arr = new int[n];
        size = n;
    }
    
    // Member function to input n numbers into the array
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
    
    // Member function to show the values stored in the array
    public void display() {
        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Member function to arrange the elements of the array in ascending order using Bubble sort
    public void bubbleSort() {
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Member function to arrange the elements of the array in ascending order using Selection sort
    public void selectionSort() {
        int minIndex, temp;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    // Member function to arrange the elements of the array in ascending order using Insertion sort
    public void insertionSort() {
        int j, temp;
        for (int i = 1; i < size; i++) {
            j = i - 1;
            temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    
    // Member function to merge two sorted sub-arrays of the array
    private void merge(int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + j + 1];
        }
        
        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
        }
        k++;
    }
    
    while (i < leftSize) {
        arr[k] = leftArr[i];
        i++;
        k++;
    }
    
    while (j < rightSize) {
        arr[k] = rightArr[j];
        j++;
        k++;
    }
}

// Member function to arrange the elements of the array in ascending order using Merge sort
public void mergeSort(int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }
}

// Member function to partition the array and arrange the elements in ascending order using Quick sort
 int partition(int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    int temp;
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

// Member function to arrange the elements of the array in ascending order using Quick sort
public void quickSort(int low, int high) {
    if (low < high) {
        int pi = partition(low, high);
        quickSort(low, pi - 1);
        quickSort(pi + 1, high);
    }
 }
}
class Pranay{
public static void main(String[] args) {
    // Create a scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter the size of the array
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    
    // Create an instance of the SortArray class
    SortArray arr = new SortArray(size);
    
    // Input the array elements from the user
    System.out.println("Enter the array elements:");
    arr.input();
    
    // Display the original array
    System.out.print("Original array: ");
    arr.display();
    
    // Sort the array using Bubble sort and display the sorted array
    arr.bubbleSort();
    System.out.print("Array after Bubble sort: ");
    arr.display();
    
    // Sort the array using Selection sort and display the sorted array
    arr.selectionSort();
    System.out.print("Array after Selection sort: ");
    arr.display();
    
    // Sort the array using Insertion sort and display the sorted array
    arr.insertionSort();
    System.out.print("Array after Insertion sort: ");
    arr.display();
    
    // Sort the array using Merge sort and display the sorted array
    arr.mergeSort(0, size - 1);
    System.out.print("Array after Merge sort: ");
    arr.display();
    
    // Sort the array using Quick sort and display the sorted array
    arr.quickSort(0, size - 1);
    System.out.print("Array after Quick sort: ");
    arr.display();
    
    // Close the scanner object to free up resources
    scanner.close();
}
}

