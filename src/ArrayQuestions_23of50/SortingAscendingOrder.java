package ArrayQuestions_23of50;

public class SortingAscendingOrder {
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,9,2,4,7,3};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }System.out.print(arr[i]);


        } System.out.println();
        System.out.println(arr[2]);
    }
}
