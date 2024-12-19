import java.util.*;
public class JaggedArray {
    private int[][] array;
    private String[] names;
    private int[] numSubjects;
    
    public JaggedArray(int[] numSubjects) {
        this.numSubjects = numSubjects;
        this.array = new int[numSubjects.length][];
        this.names = new String[]{"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < numSubjects.length; i++) {
            this.array[i] = new int[numSubjects[i]];
        }
    }
    
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.names.length; i++) {
            System.out.println("Enter marks for " + this.names[i]);
            for (int j = 0; j < this.numSubjects[i]; j++) {
                System.out.print("Subject " + (j+1) + ": ");
                this.array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void showMarks() {
        for (int i = 0; i < this.names.length; i++) {
            System.out.print(this.names[i] + ": ");
            for (int j = 0; j < this.numSubjects[i]; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void showTotalMarks() {
        for (int i = 0; i < this.names.length; i++) {
            int total = 0;
            for (int j = 0; j < this.numSubjects[i]; j++) {
                total += this.array[i][j];
            }
            System.out.println(this.names[i] + " total marks: " + total);
        }
    }
    
    public void countHighMarks() {
        for (int i = 0; i < this.names.length; i++) {
            int count = 0;
            for (int j = 0; j < this.numSubjects[i]; j++) {
                if (this.array[i][j] > 80) {
                    count++;
                }
            }
            System.out.println(this.names[i] + " high marks count: " + count);
        }
    }
    
    public void alertLowMarks() {
        for (int i = 0; i < this.names.length; i++) {
            boolean alert = false;
            for (int j = 0; j < this.numSubjects[i]; j++) {
                if (this.array[i][j] < 30) {
                    alert = true;
                    break;
                }
            }
            if (alert) {
                System.out.println(this.names[i] + " has low marks");
            }
        }
    }
public static void A13(String[] args) {
    int[] numSubjects = {3, 5, 2, 6, 4};
    JaggedArray jaggedArray = new JaggedArray(numSubjects);
    jaggedArray.inputMarks();
    jaggedArray.showMarks();
    jaggedArray.showTotalMarks();
    jaggedArray.countHighMarks();
    jaggedArray.alertLowMarks();
  }
}