package Arrays.Assignment;
import java.util.*;
import java.io.*;
//https://my.newtonschool.co/playground/code/80ctqtqgowlu/
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int []A=new int[N];
            for(int j=0;j<N;j++){
                A[j]=sc.nextInt();
            }
            int sum=0;
            for(int k=0;k<N;k++){
                if(A[k]>0){
                    sum=sum+A[k];
                }
            }
            if (sum>0){
                System.out.println(sum);
            }
            else{
                System.out.println("0");
            }
        }
    }
}
