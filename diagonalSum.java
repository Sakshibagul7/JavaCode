public class diagonalSum {
    public static void addDiagonal(int [][] matrix){
        int sum =0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j || i+j==matrix.length -1){
        //             sum+=matrix[i] [j];
        //         }
        //     }
        // }


         // Optimised apporach
         for(int i=0;i<matrix.length;i++){
            if(i==i){
                sum+=matrix[i][i];
                if(i!=matrix.length-1-i ){
                   sum+=matrix[i][matrix.length-1-i];
                }
            }
        }
         
        System.out.println(sum);
    }
    public static void main(String [] args){
        int matrix [][]= {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
                          addDiagonal(matrix);
                        }
                
}
