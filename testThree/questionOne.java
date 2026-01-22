import java.util.Scanner;

public class questionOne {
    public static void negativePositiveFunc(int[] num){
        int index=0;
        for(int i=1;i<num.length;i++){
            if(num[i]<0){
                int temp=num[i];
                num[i]=num[index];
                num[index++]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num={19,-13,15,-12,-18,-16,1,3};
        negativePositiveFunc(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

}
