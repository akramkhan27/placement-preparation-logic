import java.util.Scanner;

public class question01{
    public static void funBuzz01(int num){
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
    public static void funBuzz02(int num){
        if(num%3==0){
            System.out.print("Fun"+" ");
        }
        if(num%7==0){
            System.out.print("Buzz");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num=sc.nextInt();
        // funBuzz01(num);
        funBuzz02(num);
    }
}