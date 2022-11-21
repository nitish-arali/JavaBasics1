package Recursion;

public class PowerOfN {
    static int powerLinear(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=powerLinear(x,n-1);
        int xn=x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x=5;
        int n=3;
        int i=powerLinear(5,3);
        System.out.println(i);
    }
}
