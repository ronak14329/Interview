/**
 * 
 */
package matrix;

/**
 * @author Ronak Goyal
 *
Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]

Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]

 */
public class ReshapeMatrix {

	/**
	 * @param args
	 */
	
	public static int[][] reshapematrix(int [][]matrix ,int r, int c){
		int row = matrix.length;
		int col = matrix[0].length;
		if(r *c != row * col)return matrix;
		int [][]res = new int[r][c];
		int k =0;
		for( int i =0; i<r ;i++){
			for(int j =0 ;j<c ;j++){
				res[i][j]= matrix[k/row][k%row];
				k++;
			}
		}return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] input = {{1,2},{3,4}};
     int [][]res = reshapematrix(input, 1, 4);
     for( int i =0; i<res.length ;i++){
			for(int j =0 ;j<res[0].length ;j++){
			System.out.print(res[i][j] +",");	
			}
		}
	}

}
