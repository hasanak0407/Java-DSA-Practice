package Day4;

import java.util.Scanner;

public class PythogoreanTriplets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter c: ");
        int c=sc.nextInt();

        int max,min;
        if(a>b && a>c){
            max=a;
        }
        else if(b>c){
            max=b;
        }
        else{
            max=c;
        }
        if(a<b && a<c){
            min=a;
        }
        else if(b<c){
            min=b;
        }
        else{
            min=c;
        }
        int length;
        if(a<max && a>min){
            length=a;
        }
        else if(b<max && b>min){
            length=b;
        }
        else{
            length =c;
        }

        int hypo=max;
        int breadth=min;
        System.out.println("Hypo: "+hypo);
        System.out.println("Breadth : "+breadth);
        System.out.println("Length : "+length);

        if((hypo*hypo)==(breadth*breadth)+(length*length)){
            System.out.println("It is a Right Angled Triangle");
        }
        else{
            System.out.println("It is not a Right Angled Triangle");
        }
    }
}
