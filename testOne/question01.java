package testOne;
import java.util.Scanner;

public class question01{
    public static void funBuzz(int num){
        if(num%3==0 && num%7==0){
            System.out.println("Fun Buzz");
        }
        else if(num%3==0){
            System.out.println("Fun");
        }
        else if(num%7==0){
            System.out.println("Buzz");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        funBuzz(num);
    }
}