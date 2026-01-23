import java.util.Scanner;

public class questionOne {
    public static void printUnique(int[] nums){
        int uniqueNum=nums[0];
        System.out.print(nums[0]+" ");
        for(int i=1;i<nums.length;i++){
            if(uniqueNum!=nums[i] ){
                System.out.print(nums[i]+" ");
                uniqueNum=nums[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,1,2,2,2,5};
        printUnique(nums);
    }
}

