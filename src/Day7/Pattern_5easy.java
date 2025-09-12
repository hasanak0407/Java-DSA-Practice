package Day7;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Pattern_5easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                st=st+2;
                sp--;
            }
            else{
                st=st-2;
                sp++;
            }
        }
    }
}
