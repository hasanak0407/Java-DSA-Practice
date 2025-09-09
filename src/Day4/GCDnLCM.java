package Day4;

import java.util.Scanner;

public class GCDnLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("GCD(Greates Common Divisor)");
        System.out.print("Enter First Number : ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 =sc.nextInt();
        int on1=n1;
        int on2=n2;

        while(n1%n2!=0){
             int r=n1%n2;
             n1=n2;
             n2=r;
        }
        int gcd=n2;
        System.out.println("GCD is : "+gcd);
        int lcm=(on1*on2)/gcd;
        System.out.println("Lcm is : "+lcm);


    }
}
