package Day1;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Password\n");
        String Password=sc.nextLine();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        for(int i=0;i<Password.length();i++){
            count1++;
            char ch=Password.charAt(i);
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'){
                count2++;
            }
            if(ch>='1' && ch<='9'){
                count3++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                count4++;
            }
            if (ch >= 'a' && ch <= 'z') {
                count5++;
            }



        }

        if(count1<8){
            System.out.println("Password must have 8 characters");
        }
        if(count2<1){
            System.out.println("There is No special character");
        }
        if(count3<1){
            System.out.println("there is no digits");
        }
        if(count4<1){
            System.out.println("there is no upper case");
        }
        if(count5<1){
            System.out.println("there is no lower case");
        }
        if(count1>=8 && count2>=1&& count3>=1 && count4>=1 && count5>=1){
            System.out.println("Crazy Passwrod Mama");
        }



    }
}
