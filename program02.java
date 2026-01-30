import java.util.Scanner;

import javax.management.QueryExp;

public class program02 {
    public static void checkPower(int x,int y){
        int num=y;
        boolean flag=false;
        while(num!=0){
            int quotient=num/x;
            if(quotient==x){
                flag=true;
                break;
            }
            num/=x;
        }
        if(flag){
            System.out.println(y+" is a power of "+x);
        }else{
            System.out.println(y+" is not a power of "+x);
        }
    }
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter X : ");
        x=sc.nextInt();
        System.out.println("Enter Y : ");
        y=sc.nextInt();
        checkPower(x,y);
    }
}
