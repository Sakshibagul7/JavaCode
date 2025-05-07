public class matrixZero {

    public static void matrixZero(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] row = new int[n]; 
        int [] col= new int[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
                
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j]=0;
                }
            }
         }
        }
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
            };
    
            matrixZero(matrix);
    
            // Print the modified matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
   

