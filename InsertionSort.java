public class InsertionSort {
    public static void InsertionS(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            // Finding out the correct posion to insert
            while( prev >=0 && nums[prev] >curr){
                nums[prev+1] =nums[prev];
                prev--;
            }
            // Insertion
            nums[prev+1] = curr;
        }
    }

    public static void printArr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i] + " ");
        }System.out.println();
    }
    public static void main (String [] args ){
        int nums[]={ 7,4,9,3,5,7,1};
        InsertionS(nums);
        printArr(nums);
    }
}

//  Time complexity : O(n^2)
// space complexity : O(1)