package Day8;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int st=(n+1)/2;
        int sp=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=st; j++) {
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2) {
                st--;
                sp = sp + 2;
            }
            else{
                st++;
                sp=sp-2;
            }
            System.out.println();
        }
    }
}
