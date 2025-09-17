package Day12;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        for (int i = 1; i <=n ; i++) {
            if(i==n/2+1) {
                int q=n;
                for (int j = 1; j <= q; j++) {

                    System.out.print("*\t");
                }
                System.out.println();
                continue;
            }


            for (int j = 1; j <=sp ; j++) {
                    System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                    System.out.print("*\t");
            }



            if(i<=n/2){
                st++;
                if(i==n/2){
                    st--;
                }
            }
            else{
                st--;
            }
            System.out.println();


        }
    }
}
