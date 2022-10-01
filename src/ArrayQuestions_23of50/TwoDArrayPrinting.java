package ArrayQuestions_23of50;
import java.util.*;


public class TwoDArrayPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Number of Columns: ");
        int col=sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.println("Enter array elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix looks like");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
