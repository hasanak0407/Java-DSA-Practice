package Day6;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n stars: ");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
