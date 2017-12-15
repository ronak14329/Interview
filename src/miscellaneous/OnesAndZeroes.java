package miscellaneous;

public class OnesAndZeroes {
	 public static int findMaxForm(String[] strs, int m, int n) {
	        int[][] dp = new int[m + 1][n + 1];
	        for (String s: strs) {
	        	System.out.println("for string " +s);
	            int[] count = countzeroesones(s);
	            for (int zeroes = m; zeroes >= count[0]; zeroes--){
	            	System.out.println("The value of zeroes = "+zeroes);
	                for (int ones = n; ones >= count[1]; ones--){
	                	System.out.println("The value of ones = "+ones);
	                    dp[zeroes][ones] = Math.max(1 + dp[zeroes - count[0]][ones - count[1]], dp[zeroes][ones]);
	                    System.out.println("The value of process dp["+(zeroes-count[0])+"]["+(ones-count[1])+"]= "+dp[zeroes - count[0]][ones - count[1]]);
	                    System.out.println("The value of dp["+zeroes+"]["+ones+"]= "+dp[zeroes][ones]);
	       
	                    for(int i=0;i<m;i++){
		    	        	for(int j=0;j<n;j++){
		    	        		System.out.print(" "+dp[m][n]);
		    	        	}
		    	        	System.out.println();
		    	        }
	                   
	                }System.out.println();
	                for(int i=0;i<m;i++){
	    	        	for(int j=0;j<n;j++){
	    	        		System.out.print(" "+dp[m][n]);
	    	        	}
	    	        	System.out.println();
	    	        }
	                }
	            System.out.println();
	        for(int i=0;i<m;i++){
	        	for(int j=0;j<n;j++){
	        		System.out.print(" "+dp[m][n]);
	        	}
	        	System.out.println();
	        }
	        }
	        return dp[m][n];
	    }
	    public static int[] countzeroesones(String s) {
	        int[] c = new int[2];
	        for (int i = 0; i < s.length(); i++) {
	            c[s.charAt(i)-'0']++;
	        }
	        System.out.println("The count value for "+s);
	        System.out.println("The count[0] = "+c[0]);
	        System.out.println("The count[1] = "+c[1]);
	        return c;
	    }
	    public static int removeDuplicates(int[] nums) {
	    	   int i = 0;
	    	   for (int n : nums)
	    	      if (i < 2 || n > nums[i - 2]){
	    	         nums[i] = n;
	    	         
	    	   System.out.println("nums["+i+"]= "+nums[i]);
	    	   i++;
	    	   }
	    	   return i;
	    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] s = {"10", "0001", "111001", "01","00","1", "0"};
System.out.println(findMaxForm(s,5,3));
int []x={1,1,1,1,1,2,2,3,3,3};
System.out.println("Hi "+removeDuplicates(x));
	}

}
