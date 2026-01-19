import java.util.Scanner;

public class question02 {
    public static void printOdd01(int start, int end){
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void printOdd02(int start, int end){
        if(start%2==0) start+=1;
        for(int i=start;i<=end;i=i+2){
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
        // printOdd01(start, end);
        printOdd02(start, end);

    }
}
