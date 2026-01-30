import java.util.Arrays;

public class program03 {
    public static int[] removeDuplicate(int[] array){
        Arrays.sort(array);
        int[] newArray= new int[array.length];
        int index=0;
        newArray[0]=array[0];
        int j=1;
        for(int i=1;i<array.length;i++){
            if(array[index]!=array[i]){
                newArray[j++]=array[i];
            }
            index=i;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,1,4,5,6,1,2};
        int[] newArray=removeDuplicate(array);
        System.out.println("After removing duplicate");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
