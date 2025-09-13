package Day8;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n=sc.nextInt();
//        int st=1;
//        int sp=n-1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=sp;j++){
//                System.out.print("\t");
//            }
//            for (int j = 1; j <=st; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//            sp--;
//        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j = 1; j <=n ; j++) {
                if(i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
