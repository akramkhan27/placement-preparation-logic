import java.util.Scanner;

public class questionTwo {
    public static void printFibonacci(int num){
        int fib1=1;
        int fib2=2;
        for(int i=1;i<=num;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(fib1+" ");
                int temp=fib2;
                fib2=fib1+fib2;
                fib1=temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        printFibonacci(number);

    }
}
