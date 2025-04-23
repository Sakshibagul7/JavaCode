import java.util.Arrays;

public class twoSum {
    public static int[] Sum(int nums[],int target){
        for(int i=0;i<nums.length-1;i++){
         if(nums[i]+nums[i+1]==target){
            return new int[]{i,i+1};
         }
        }
        return new int[] {}; 
    }
    public static void main(String [] args){
        int nums[]={2,7,11,15};
        int target=9;
        int ans [] =Sum(nums, target);
        System.out.println("Ans is :" + Arrays.toString(ans));
    }
}
