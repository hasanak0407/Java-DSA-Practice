package Day2;

import java.util.Scanner;

public class CountDigitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        String n=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++){

            count++;
        }
        System.out.println("No of Digits is :"+count);
    }
}
