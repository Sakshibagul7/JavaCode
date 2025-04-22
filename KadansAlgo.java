public class KadansAlgo {

    public static int Kadans(int nums[]){
        int cs=0;
        int ms=nums[0];
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];

        ms=Math.max(cs,ms);
        if(cs<0){
            ms=0;
        }
       
    } return ms;
    
}
    
    public static void main(String[] args) {

        int nums[]={2,3,4,-4,-6,8};
        int ans= Kadans(nums);
        System.out.println("Maximum subarray sum is :" + ans);

    }
}

