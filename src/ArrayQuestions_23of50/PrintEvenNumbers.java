package ArrayQuestions_23of50;
import java.util.*;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] %2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
