package miscellaneous;

public class SpiralMatrixFromZero {
	public int[][] generateMatrix(int n) {
	    int[][] result = new int[n][n];
	 
	    int k=1; 
	    int top=0;
	    int bottom=n-1;
	    int left=0;
	    int right=n-1;
	 
	    while(k<=n*n){
	        for(int i=left; i<=right; i++){
	            result[top][i]=k;
	            k++;
	        }    
	        top++;
	 
	        for(int i=top; i<=bottom; i++){
	            result[i][right]=k;
	            k++;
	        }
	        right--;
	 
	        for(int i=right; i>=left; i--){
	            result[bottom][i]=k;
	            k++;
	        }
	        bottom--;
	 
	        for(int i=bottom; i>=top; i--){
	            result[i][left] = k;
	            k++;
	        }
	        left++;
	    }
	 
	    return result;
	}

	public static void main(String[] args) {
		SpiralMatrixFromZero s= new SpiralMatrixFromZero();
		//System.out.println(s.generateMatrix(3));
		int[][] a = new int[4][4];
		a=s.generateMatrix(4);
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
