package Day1;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        System.out.println("Enter t value:");
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int count=0;
            int n=sc.nextInt();

            for(int div=1;div<=n;div++){
                if(n%div==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }




    }
}