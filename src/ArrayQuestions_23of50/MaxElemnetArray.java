package ArrayQuestions_23of50;

public class MaxElemnetArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,7,25,13,851,187161};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            }
        System.out.println(max);
        }
    }
