package Day5;

import java.util.Scanner;

public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Bulbs: ");
        int n=sc.nextInt();

        for(int i=1;i*i<=n;i++){
            System.out.println("Bulb "+i*i+" is On");
        }
    }
}
