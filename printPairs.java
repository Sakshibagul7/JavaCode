public class printPairs {

  public static void printP(int nums[]){
    int ts = 0;
    for(int i=0; i<nums.length; i++){
      int curr =i;
      for(int j=i+1;j<nums.length;j++){
        System.out.print("(" + nums[i] + "," + nums[j] +")");
        ts++;
      }
    } System.out.println();
      System.out.println(ts);
    }
    public static void main(String [] args){
        int nums[]={2,4,6,8,10};
        printP(nums);

    }
}
