package Day2;

import java.util.Scanner;

public class CountDigitInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            if(n!=0){
               n= n/10;
               count++;
            }
        }
        System.out.println("No of Digits: "+count);
    }
}
