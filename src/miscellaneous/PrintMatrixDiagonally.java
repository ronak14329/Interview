package miscellaneous;


import java.util.Arrays;	
	 
	public class PrintMatrixDiagonally {
	
	    public static int[][] printMatrixDiagonally(int[][] matrix) {
	
	        int row, col;
	        int rowCount = matrix.length;
	        int columnCount = matrix[0].length;
	int i=0;
	int j=0;
	int [][]result = new int[rowCount+columnCount-1][rowCount];
	        for (int k = 0; k < rowCount; k++) {
	        	j=0;
	            for (row = k, col = 0; row >= 0 && col < columnCount; row--, col++) {
	               // System.out.print(matrix[row][col] + " " );
	            	result[i][j]=matrix[row][col];
	            	j++;
	            }
	            i++;
	          //  System.out.println();
	        }
	
	        for (int k = 1; k < columnCount; k++) {
	        	j=0;
	            for (row = rowCount - 1, col = k; row >= 0 && col < columnCount; row--, col++) {
	              //  System.out.print(matrix[row][col] + " " );
	                result[i][j]=matrix[row][col];
	            	j++;
	            }i++;
	           // System.out.println();
	        }
	        return result;
	    }
	
	    public static void main(String[] args) {
	        int row = 4, col = 5;
	        int k = 1;
	        int matrix[][] = new int[row][col];
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                matrix[i][j] = k++;
	            }
	        }
	
	        System.out.println("Input Matrix" );
	        for (int i = 0; i < matrix.length; i++) {
	            System.out.println(Arrays.toString(matrix[i]));
	        }
	        
	        System.out.println("\nPrinting Matrix Diagonally" );
	        int [][]res=printMatrixDiagonally(matrix);	
	    for(int i=0;i<row+col-1;i++){
	    	for(int j=0;j<row&& j<=i;j++){
	    		System.out.print(res[i][j]+" ");
	    	}System.out.println();
	    }
	    }
	
	}