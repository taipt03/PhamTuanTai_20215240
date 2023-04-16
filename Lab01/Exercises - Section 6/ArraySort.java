import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
   public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = scan.nextInt();
      int[] array = new int[n];  
      for (int i=0;i<n;i++){
         array[i]=scan.nextInt();
      }
      Arrays.sort(array);
      System.out.println("Sorted array: " + Arrays.toString(array));
      int sum = 0;
      for (int i = 0; i < n; i++) {
         sum += array[i];
      }
      double average = sum/n;
      System.out.println("Sum of array elements: " + sum);
      System.out.println("Average value of array elements: " + average);
   }
}