package ArrayQuestions50;
import java.util.*;

public class SearchAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        System.out.println("Input the elements of an array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int element=sc.nextInt();
        for(i=0;i<n;i++) {
            if (arr[i] == element) {
                System.out.println("Element Found");
                break;
            }
        }

        if(i==n)
        {
            System.out.println("element not found");
        }
    }
}
