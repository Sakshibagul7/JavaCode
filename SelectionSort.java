public class SelectionSort {
    public static void SelectionS(int nums []){
        for(int i=0;i<nums.length;i++){
            int minEle=i;
            for(int j=i;j<nums.length;j++){
                if(nums[minEle]>nums[j]){  // For decreasing order nums[minEle] <nums[j]
                    minEle =j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minEle];
            nums[minEle]=temp;
        }
    }

    public static void printArr(int nums []){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i] + " ");
        } System.out.println();
    }
    public static void main(String [] args){
        int nums[]={2,4,5,6,9,3};
        SelectionS(nums);
        printArr(nums);
    }
}

//  Time complexity :o(n^2)
// space complexity :O(1)
