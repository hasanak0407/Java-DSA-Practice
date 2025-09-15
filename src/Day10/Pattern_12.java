package Day10;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n rows to print Fibonacci: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
