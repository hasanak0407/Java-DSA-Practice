package Day2;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Reverse: ");
        int n=sc.nextInt();

        while(n!=0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}
//Update Email