package Day15;

import java.util.Scanner;

public class Pattern_Practice3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Create a Rectangle: ");
        System.out.println("Enter Length: ");
        int l=sc.nextInt();
        System.out.println("Enter Breadth: ");
        int b= sc.nextInt();

        for(int i=1;i<=l;i++){
            for(int j=1;j<=b;j++){
                if(i==1||i==l||j==1||j==b){
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
