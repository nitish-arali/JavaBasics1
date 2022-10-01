package ArrayQuestions_23of50;
import java.util.*;

public class Avg_Sum_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        double avg=0;
        double sum=0;
        int min,max;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/2;
        System.out.println("Sum of elements: "+sum);
        System.out.println("Average of elements: "+avg);
        System.out.println("Minimum element in the array is: "+arr[0]);
        System.out.println("Maximum element in the array is: "+arr[n-1]);
    }
}
