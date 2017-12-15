package miscellaneous;
/**
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * @author Anil Garg
 *
 */
public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
	    if(grid == null || grid.length==0)
	        return 0;
	 
	    int m = grid.length;
	    int n = grid[0].length;
	 
	    int[][] dp = new int[m][n];
	    dp[0][0] = grid[0][0];    
	 
	    // initialize top row
	    for(int i=1; i<n; i++){
	        dp[0][i] = dp[0][i-1] + grid[0][i];
	    }
	 
	    // initialize left column
	    for(int j=1; j<m; j++){
	        dp[j][0] = dp[j-1][0] + grid[j][0];
	    }
	 
	    // fill up the dp table
	    for(int i=1; i<m; i++){
	        for(int j=1; j<n; j++){
	            if(dp[i-1][j] > dp[i][j-1]){
	                dp[i][j] = dp[i][j-1] + grid[i][j];
	            }else{
	                dp[i][j] = dp[i-1][j] + grid[i][j];
	            }
	        }
	    }
	    for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp.length;j++){
				System.out.print(" "+dp[i][j]);
				
			}System.out.println();
		}
	    return dp[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinimumPathSum s = new MinimumPathSum();
int[][] b={
		   {1,   4,  7, 11, 15},
		   {2,   5,  8, 12, 19},
		   {3,   6,  9, 16, 22},
		   {10, 13, 14, 17, 24},
		   {18, 21, 23, 26, 30}
		   };
System.out.println(b);
s.minPathSum(b);
	}

}
