public class BubbleSort {
//     public static void BubbleS(int nums[]){
//         for(int turn=0;turn<nums.length-1;turn++){
//             for(int j=0;j<nums.length -1-turn ;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp =nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int nums[]){
//         for(int i=0;i<nums.length-1;i++){
//             System.out.print(nums[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main (String [] args){
//         int nums[] ={3,5,6,8,9,1};
//         BubbleS(nums);
//         printArr(nums);
//     }




    public static void optimisedBubble(int nums[]) {
        for (int i = 0; i < nums.length-1; i++) {
            int swap =0;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap++;
                }
            }
             if(swap==0){
                break;
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
            System.out.println();
    }

    public static void main(String[] args) {
        int nums [] ={3,5,6,8,9,1};
        optimisedBubble(nums);
        printArr(nums);

    }
}



/* 
✅ Time Complexity Analysis
Best Case (Already Sorted): O(n)
Worst Case (Reverse Sorted):O(n^2)
Average Case (Random Order):O(n^2)

🔸 Space Complexity: O(1) */





