package Day3;

import java.util.Scanner;

class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to be inversed: ");
        int n=sc.nextInt();
        int inv=0;
        int op=1;
        while (n != 0) {
            int od=n%10;
            int id=op;
            int ip=od;
            //applying inverse formula
            inv=inv+id*(int)Math.pow(10,ip-1);

            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}