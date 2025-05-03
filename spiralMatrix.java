
// Important question asked in Google , Microsoft , Oracle , Amazon ,Abode and many more

public class spiralMatrix {

    public static void spiralM (int nums [] []){
        int startRow =0 ;
        int endRow = nums.length-1;
        int startCol =0;
        int endCol=nums[0].length-1;

        //  j=> columns and i=> rows

        while(startRow <= endRow && startCol <= endCol){

             // top
            for(int j=startCol;j<=endRow;j++){
                System.out.print(nums[startRow] [j] +" ");
            }

            // right
            for(int i=startRow+1 ;i<=endRow;i++){
                System.out.print(nums[i] [endCol]+" ");
            }

            // bottom 
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol== endRow){
                    break;
                }
                System.out.print(nums[endRow] [j] +" ");
            }

            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(nums[i] [startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
           System.out.println();
    }
    public static void main (String [] args){
        int nums [] [] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralM(nums);
    }
}
