package ArrayQuestions_23of50;

public class LinearSearch {
    public static int Ls(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] ar1=new int[]{1,2,5,3,4,7,8,9,0};
        int key=5;
        System.out.println(key+" is found at index "+Ls(ar1,key));

    }
}
