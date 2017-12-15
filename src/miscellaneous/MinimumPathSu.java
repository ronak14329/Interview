package miscellaneous;

public class MinimumPathSu {
	 public int minPathSum(int[][] grid) {
	      int m =grid.length;
	      int n = grid[0].length;
	      for(int i=0;i<m;i++){
	          for(int j=0;j<n;j++){
	              if(i==0 && j!=0){grid[i][j]= grid[i][j]+grid[i][j-1];// checking for the row elemnets
	              System.out.println("1matrix"+i+"&"+j+"="+grid[i][j]);}
	              
	              if(j==0 && i!=0){ grid[i][j]=grid[i][j] + grid[i-1][j]; // checking the column elements
	              System.out.println("2matrix"+i+"&"+j+"="+grid[i][j]);}
	              if(i!=0 && j!=0) {grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);// finding the least element to add in the grid sum from up and left elements.
	              System.out.println("3matrix"+i+"&"+j+"="+grid[i][j]);
	          }}
	      }
	      System.out.println("matrix output="+grid[m-1][n-1]);
	      return grid[m-1][n-1];// returning the value in the rightmost column a
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinimumPathSu res = new MinimumPathSu();
int grid[][]={{1,4,7,11,15},
          {2,5,  8, 12, 19},
          {3,   6,  9, 16, 22},
          {10, 13, 14, 17, 24},
          {18, 21, 23, 26, 30}};
res.minPathSum(grid);

	}

}
