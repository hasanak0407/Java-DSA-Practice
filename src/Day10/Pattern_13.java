package Day10;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();


        for (int i = 0; i <n; i++) {
            int icj=1;
            for(int j=0;j<=i;j++) {
                System.out.print(icj+"\t");
                int icpj=icj*(i-j)/(j+1);
                icj=icpj;
            }
            System.out.println();
        }
    }
}
