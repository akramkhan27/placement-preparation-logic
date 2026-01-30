import java.util.Scanner;

public class program01 {
    public static void swap(int[] array){
        if(array.length>1){
            for(int i=1;i<array.length;i=i+2){
                int temp=array[i-1];
                array[i-1]=array[i];
                array[i]=temp;
            }
        }else{
            System.out.println("Array is < 2");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of elements : ");
        int size=sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<array.length;i++){
            System.out.println("Enter Element "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        swap(array);
        System.out.println("Array Elements after swapping adjacent elements : ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
