package corejava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter any number here:");
        int number=read.nextInt();
        int factorial=1;
        for(int i=1; i<=number;i++){
            factorial=factorial*i;

        }
        System.out.println("Factorial  number= "+factorial);
    }

}
