public class ConuntingSort {
    public static void ConuntingS(int nums[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest =Integer.max(largest,nums[i]);
        }

        int count [] =new int [largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j] =i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i] + " ");
        }System.out.println();
    }

    public static void main(String []args){
        int nums[]={4,5,6,2,1,1,7,8,8,5,4};
        ConuntingS(nums);
        printArr(nums);
    }
}

/*
 
Time Complexity:	O(n + k)
Space Complexity:   O(k) (due to count array)
 */
