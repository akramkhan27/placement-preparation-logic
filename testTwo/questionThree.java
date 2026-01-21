import java.util.Scanner;

public class questionThree {
    public static void printNumberPattern(int number){
        for(int i=number;i>=1;i--){
            for(int s=i-1;s>=1;s--){
                System.out.print(" ");
            }
            for(int j=number;j>=i;j--){
                System.out.print(j);
            }
            for(int k=i+1;k<=number;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=1;i<number;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=number;j>i;j--){
                System.out.print(j);
            }
            for(int k=number;k>i+1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void printStarPattern(int number){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        printNumberPattern(num);
        printStarPattern(num);
    }
}
