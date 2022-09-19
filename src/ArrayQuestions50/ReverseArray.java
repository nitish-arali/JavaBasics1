package ArrayQuestions50;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        //System.out.println("Array Elements are");
        for(int i=1;i<arr.length;i=i+2){
            System.out.print(arr[i]);
        }
//        System.out.println();
//        System.out.println("Reverse Array");
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]);
//        }

    }
}
