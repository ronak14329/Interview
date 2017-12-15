package miscellaneous;

public class NumTrees {
	public static int numTrees(int n) {
	    int [] G = new int[n+1];
	    G[0] = G[1] = 1;// Since for the number of node 0 and 1 the number of unique binary tree which can be made is 1 .
	     // WE are running the loop to find F(i, n) = G(i-1) * G(n-i)	1 <= i <= n 
	     //G(n) = G(0) * G(n-1) + G(1) * G(n-2) + … + G(n-1) * G(0) 
	    for(int i=2; i<=n; ++i) {
	    	for(int j=1; j<=i; ++j) {
	    		System.out.println("G["+(j-1)+"]=" +G[j-1]);
	    		System.out.println("G["+(j)+"-"+i+"]=" +G[j-1]);
	    		System.out.println("G[i]= "+G[i]);
	    		G[i] += G[j-1] * G[i-j];
	    		System.out.println("G["+i+"]="+G[i]);
	    		System.out.println();
	    	}
	    }

	    return G[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=numTrees(3);
System.out.println("The output is "+x);
	}

}
