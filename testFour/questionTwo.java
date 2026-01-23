
public class questionTwo {
    public static void main(String[] args) {
        int[] arr={100,200,300,400};
        int k=2;

        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int low=0;
        int high=k;
        while(high<arr.length){
            maxSum=Math.max(sum,maxSum);
            sum-=arr[low];
            low++;
            if(high<arr.length){
                sum+=arr[high];
                high++;
            }
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);

    }
}
