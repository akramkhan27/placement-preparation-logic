package testOne;
import java.util.Scanner;

public class question02 {
    public static void printOdd(int start, int end){
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start=sc.nextInt();
        System.out.println("Enter end number: ");
        int end=sc.nextInt();
        printOdd(start, end);

    }
}
