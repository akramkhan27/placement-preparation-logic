import java.util.Scanner;

public class questionOne {
    public static int factorial(int num){
        if(num==2)
            return 2;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        int factorialNumber= factorial(number);
        System.out.println(factorialNumber);
    }
}
