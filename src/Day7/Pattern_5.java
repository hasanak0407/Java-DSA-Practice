package Day7;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sp=n/2;
        int st=1;
        for (int i = 1; i <=n ; i++) {
            if (i % 2 != 0) {


                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");

                }
                sp--;
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
                st=st+2;


            }
            System.out.println();
        }
        System.out.println();
        int nsp=1;
        int nst=n-2;

        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {


                for (int j = 1; j <= nsp; j++) {
                    System.out.print("\t");
                }
                nsp++;
                for(int j=1;j<=nst;j++){
                    System.out.print("*\t");
                }
                nst=nst-2;

            }
            System.out.println();
        }


    }
}


