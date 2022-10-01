package ArrayQuestions_23of50;
import java.util.*;
import java.io.*;

public class Q {
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] fr = new int[arr.length];
            int visited=-1;
            int count=1;

            Arrays.sort(arr);

            for(int i=0;i<n;i++){
                int g=i+1;
                    if(g<n && arr[i]==arr[g]){
                        g++;
                        fr[i]=visited;
                        count++;
                    }

                if (fr[i]!=visited){
                    fr[i]=count;
                    count=1;
                    }
                if (fr[i]>1 ){
                    System.out.print(arr[i]+" "+fr[i]);
                    System.out.println();
                }
            }
        }
}

