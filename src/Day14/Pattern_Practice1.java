package Day14;

import java.util.Scanner;

public class Pattern_Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(val + "\t");
                    val++;
                }
                System.out.println();

            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(val + "\t");
                    val--;
                }
                System.out.println();
            }
                if (i % 2 != 0) {
                    val--;
                    val = val + n;

                } else {
                    val++;
                    val = val + n;
                }
            }
        }
    }


