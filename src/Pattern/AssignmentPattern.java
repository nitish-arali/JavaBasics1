package Pattern;

import java.util.*;
public class AssignmentPattern {
    public static void main(String[] args) {
        int i, j, k, l,m;
        for (i = 5; i >= 1; i--) {
            {
                for (j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (l = 4; l >= i; l--)
                    System.out.print("*" + " ");
            }
            {
                for (m=i; m<=4; m++)
                    System.out.print("*"+ " ");
            }
            for (k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
