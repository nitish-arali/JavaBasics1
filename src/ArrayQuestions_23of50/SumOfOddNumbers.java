package ArrayQuestions_23of50;
import java.util.*;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Odd element: ");
        int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] % 2 != 0){
                    sum=arr[i]+sum;
                }
            }
        System.out.print(sum+" ");
    }
}
