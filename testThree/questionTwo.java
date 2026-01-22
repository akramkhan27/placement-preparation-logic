import java.util.Scanner;

public class questionTwo {
    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+"st element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Element added successfully");
        System.out.println("Enter the element for search in an array : ");
        int target=sc.nextInt();
        System.out.println("Sorting the array first");
        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int index=binarySearch(arr,target);
        if(index==-1){
            System.out.println("Element not present");
        }else{
            System.out.println("Element found");
        }

    }
}
