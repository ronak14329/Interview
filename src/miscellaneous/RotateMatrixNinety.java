package miscellaneous;
/**
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).
 * @author Anil Garg
 *
 */
public class RotateMatrixNinety {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(" "+matrix[i][j]);
				
			}System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RotateMatrixNinety s = new RotateMatrixNinety();
int[][] b={
		   {1,   4,  7, 11, 15},
		   {2,   5,  8, 12, 19},
		   {3,   6,  9, 16, 22},
		   {10, 13, 14, 17, 24},
		   {18, 21, 23, 26, 30}
		   };
System.out.println();
s.rotate(b);
	}

}
