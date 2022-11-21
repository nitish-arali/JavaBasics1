package Recursion;

public class PowerOfNLog {
    static int PowerOfN(int x,int n){
        if(n==0) return 1;
        int xpnb2 = PowerOfN(x,n/2);
        int xn=xpnb2*xpnb2;

        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }
    public static void main(String[] args) {
        int x=5;
        int n=6;
        int i=PowerOfN(x,n);
        System.out.println(i);
    }
}
