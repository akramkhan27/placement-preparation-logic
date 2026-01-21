import java.util.Scanner;

public class questionFour {
    public static void printBinary(int num){
        int changeNumber=num;

        while(changeNumber!=0){
            int rem=changeNumber%2;
            System.out.print(rem+" ");
            changeNumber/=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        printBinary(num);
    }
}
