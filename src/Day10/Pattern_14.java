package Day10;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n to print multiplication table : ");
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n +" * "+ i + " = " + (n*i));
        }
    }
}
