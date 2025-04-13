public class reverseArray {

    public static void reverseA(int nums[]){
        int s=0, e=nums.length -1;
        while(s<e){

            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
       
    }
    public static void main(String []args){
        int nums[]={34,22,45,67,87,65};
        reverseA(nums);

        // print 
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
       
    }
}
