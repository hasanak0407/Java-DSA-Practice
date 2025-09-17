package Day12;

import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int sp=0;
        int st=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                if(i>1 && i<=n/2 && j>1 && j<st){
                    System.out.print("\t");

                }
                else{
                    System.out.print("*\t");
                }

            }

            if(i<=n/2){
                st=st-2;
                sp++;
            }
            else{
                sp--;
                st=st+2;
            }
            System.out.println();
        }
    }
}
