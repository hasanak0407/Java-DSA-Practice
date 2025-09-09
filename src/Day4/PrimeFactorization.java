package Day4;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to get Prime Factorization: ");
        int n=sc.nextInt();

        for(int div=2;div*div<=n;div++){
            while(n%div==0){
                n=n/div;
                System.out.println(div);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
