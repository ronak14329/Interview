package miscellaneous;
/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 * @author Anil Garg
 *
 */
public class SearchMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
	    int m=matrix.length-1;
	    int n=matrix[0].length-1;
	 
	    int i=m; 
	    int j=0;
	 
	    while(i>=0 && j<=n){
	        if(target < matrix[i][j]){
	            i--;
	        }else if(target > matrix[i][j]){
	            j++;
	        }else{
	            return true;
	        }
	    }
	 
	    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SearchMatrix s = new SearchMatrix();
int[][] a = new int[5][5];
int[][] b={
   {1,   4,  7, 11, 15},
   {2,   5,  8, 12, 19},
   {3,   6,  9, 16, 22},
   {10, 13, 14, 17, 24},
   {18, 21, 23, 26, 30}
   };
System.out.println(s.searchMatrix(b, 17) );
s.searchMatrix(b, 17);

	}

}
