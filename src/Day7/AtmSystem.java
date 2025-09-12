package Day7;

import java.util.Scanner;

import static java.lang.System.exit;

public class AtmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int balance=0;
            System.out.println("Welcome To NO Bank :)");
            System.out.println("Enter Your Pin: ");
            int pin = sc.nextInt();
            if (pin == 9678) {
                while(true){
                System.out.println("1.Cash Withdraw");
                System.out.println("2.Cash Deposit");
                System.out.println("3.Check Balance");
                System.out.println("4.EXIT");
                System.out.println("Enter you Choice: ");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter Amount to be Withdrawn:");
                        int amount =sc.nextInt();
                        if(amount<=balance){
                            balance=balance-amount;
                            System.out.println("Your Balance is "+balance);
                            break;
                        }
                        else{
                            System.out.println("No Suffiecient Funds");
                            break;
                        }
                    case 2:
                        System.out.println("Enter the Amount to Deposit:");
                        int deposit=sc.nextInt();
                        balance=balance+deposit;
                        System.out.println("Your Balance is "+balance);
                        break;
                    case 3:
                        System.out.println("Your Balance is "+balance);
                        break;
                    case 4:
                        System.out.println("Exited Succesfully");
                        exit(0);
                    default:
                        System.out.println("Enter Valid Option");


                }


            }
        }else {
                System.out.println("Re-enter Pin");
            }
        }
}
}
