package ArrayQuestions_23of50;

public class LeftRotateArray {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6,7};
        int n=4;

        for(int i=0;i<n;i++) {
            int j, first;
            first=arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j]=first;
        }

        System.out.println("Left Rotation Array of "+n+"=");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }}}
