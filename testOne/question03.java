package testOne;
import java.util.Scanner;

public class question03 {
    public static void checkPalindrome(int num){
        int changingNum=num;
        int reversedNum=0;
        while(changingNum!=0){
            int fact= changingNum%10;
            reversedNum= (reversedNum*10)+fact;
            changingNum/=10;
        }

        if(reversedNum==num){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        checkPalindrome(num);
    }
}
