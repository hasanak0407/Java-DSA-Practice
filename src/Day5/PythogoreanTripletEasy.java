package Day5;

import java.util.Scanner;

public class PythogoreanTripletEasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();

        int max=a;
        if (b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }

        if(max==a){
            boolean flag=((a*a)==((b*b)+(c*c)));
            System.out.println(flag);
        } else if (max==b){
            boolean flag=((b*b)==((a*a)+(c*c)));
            System.out.println(flag);

        } else {
            boolean flag=((c*c)==((b*b)+(a*a)));
            System.out.println(flag);
        }
    }
}
