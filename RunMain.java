import java.util.*;
class TwoDArray {
    private int[][] array;

    public TwoDArray(int n) {
        array = new int[2][n];
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public void display() {
        System.out.println("The array elements are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public OneDArray[] split() {
        OneDArray[] result = new OneDArray[2];
        result[0] = new OneDArray(array[0].length);
        result[1] = new OneDArray(array[0].length);
        for (int i = 0; i < array[0].length; i++) {
            result[0].set(i, array[0][i]);
            result[1].set(i, array[1][i]);
        }
        return result;
    }

    public static TwoDArray add(TwoDArray a, TwoDArray b) {
       
        TwoDArray result = new TwoDArray(a.array[0].length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < result.array[0].length; j++) {
                result.array[i][j] = a.array[i][j] + b.array[i][j];
            }
        }
        return result;
    }

    public static TwoDArray multiply(TwoDArray a, TwoDArray b) {
      
        TwoDArray result = new TwoDArray(b.array[0].length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < result.array[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < a.array[0].length; k++) {
                    sum += a.array[i][k] * b.array[k][j];
                }
                result.array[i][j] = sum;
            }
        }
        return result;
    }
}

class OneDArray {
    private int[] array;

    public OneDArray(int n) {
        array = new int[n];
    }

    public void set(int i, int value) {
        array[i] = value;
    }

    public void show() {
        System.out.println("The array elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

public class RunMain {
    public static void main(String[] args) {
        TwoDArray a = new TwoDArray(3);
        a.inputData();
        a.display();
        OneDArray[] result=a.split();
        result[0].show();
        result[1].show();
 }
}