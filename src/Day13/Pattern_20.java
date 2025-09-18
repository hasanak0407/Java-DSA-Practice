package Day13;

import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int sp=n/2+1;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1|| j==n){
                    System.out.print("*\t");
                }
                else if(i>n/2 && (i==j ||i+j==n+1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }

    }
}
