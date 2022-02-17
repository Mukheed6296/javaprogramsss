package corejava;


import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner ayan=new Scanner(System.in);
        System.out.println("Enter any number here:");
        int number=ayan.nextInt();
        int sum=0;
        int temp=number;
        while(number>0){
            int r=number%10;
            sum=sum+(r*r*r);
            number=number/10;

        }
        if(sum==temp){
            System.out.println("it's armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
