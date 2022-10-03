package ArrayQuestions_23of50;

public class Q1 {
    static void fnr(int[] arr){
        boolean check;
        for(int i=0;i<arr.length;i++){
            check=false;
            for(int j=0;j<arr.length;j++){
                if(i !=j && arr[i]==arr[j]){
                    check=true;
                    break;
                }
            }
            if(!check)
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,1,3,4,3};
        fnr(arr);
    }
}
