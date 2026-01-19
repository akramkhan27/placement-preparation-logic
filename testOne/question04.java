import java.util.Scanner;

public class question04 {
    public static void printFibonacci(int num){
        int n1=0;
        int n2=1;
        if(num==1){
            System.out.println(n1);
        }else if(num==2){
            System.out.println(n1+" "+n2);
        }
        for(int i=1;i<=num;i++){
            System.out.println(n1);
            int temp=n2;
            n2+=n1;
            n1=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        printFibonacci(num);
    }
}
