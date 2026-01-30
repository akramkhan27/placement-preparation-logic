
public class question02 {
    public static void remove_duplicates(int[] arr,int size){
        int[] duplicate= new int[size];
        int index=0; 
        int duplicateIndex=0;

        for(int i=0;i<size;i++){
            boolean isDuplicate=false;
            for(int j=0;j<index;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[index++]=arr[i];
            }else{
                duplicate[duplicateIndex++]=arr[i];
            }
        }

        for(int i=0;i<duplicateIndex;i++){
            arr[index++]=duplicate[i];
        }
        
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={58,26,91,26,70,70,91,58,58,58,66};
        remove_duplicates(a,a.length);

    }
}