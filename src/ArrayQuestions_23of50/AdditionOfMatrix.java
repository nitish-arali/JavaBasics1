package ArrayQuestions_23of50;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Number of Columns: ");
        int col = sc.nextInt();
        int[][] arr1 = new int[rows][col];
        int[][] arr2 = new int[rows][col];
        int arr3[][]=new int[rows][col];
        System.out.println("Enter the 1st matrix elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix elements");
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two matrices looks like");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("________________\n");

        for(int i=0;i<rows;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Addition of two matrices");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}