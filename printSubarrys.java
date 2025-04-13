
public class printSubarrys {

    public static void printSubA(int nums[]){
        int ts=0;// total subarrays
        for(int i=0;i<nums.length;i++){
            int s =i;
            for(int j =i;j<nums.length;j++){
                int e=j;
                for(int k=s;k<=e;k++){
                    System.out.print(nums[k] + " ");
                    } ts++;
                      System.out.println();
            }System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String [] args){
        int nums[]={2,4,6,8,10};
        printSubA(nums);
    }
}
