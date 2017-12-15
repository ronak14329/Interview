package miscellaneous;

public class NumOnce {
public static int numOnce(int[]A){
	if(A[0]==1)return A.length;
	if(A[A.length-1]==0)return 0;
	int i=0;
	int j=A.length-1;
	int mid=0;
	while(i<j){
		mid=(i+j)/2;
		if(A[mid]<A[mid+1] && mid+1>A.length)return A.length-(mid);
		else if(A[mid]==0) i=mid+1;
		else j=mid-1;
	}
	
	return A.length-(mid);
	
}
public static int countIslands(int matrix[][])
{
    int count = 0; // Initialize result
 
    // Traverse the input matrix
    for (int i=0; i<matrix.length; i++)
    {
        for (int j=0; j<matrix[0].length; j++)
        {
            // If current cell is 'X', then check
            // whether this is top-leftmost of a
            // rectangle. If yes, then increment count
            if (matrix[i][j] == 'X')
            {
                if ((i == 0 || matrix[i-1][j] == 'O') &&
                    (j == 0 || matrix[i][j-1] == 'O'))
                    count++;
            }
        }
    }
 
    return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[]={0,0,0,0,0,0,0,1};
System.out.println(numOnce(A));
int matrix[][] =  {{'O', 'O', 'O'},
        {'X', 'X', 'O'},
        {'X', 'X', 'O'},
        {'O', 'O', 'X'},
        {'X', 'O', 'X'},
        {'X', 'X', 'O'}
      };

System.out.println("hi "+countIslands(matrix));
	}
	
	 
}
