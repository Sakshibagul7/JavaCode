public class largestNo {
    public static int largestestN(int nums[],int ans){
        for(int i=1;i<nums.length;i++){
            if(nums[i]>ans){
                ans=nums[i];
            }
        } return ans;
       
    }
    public static void main(String[] args) {
        int nums[] ={22,34,5,67,99,78};
        int ans = nums[0];
        int large =largestestN(nums, ans);
        System.out.println(large);
    }
}

    