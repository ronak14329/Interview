/**
 * 
 */
package arrays;

/**
 * @author Ronak Goyal
 *
 */
public class AdvancingArray {
	
	public static boolean canReachEnd(int []A){
		int maxReach =0;
		int lastIndex = A.length;
		 for(int i =0;i<= maxReach && maxReach< lastIndex;i++){
			 maxReach = Math.max(maxReach, i+ A[i]);
		 }
		 return maxReach >=lastIndex;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A ={1,2,0,2,1};
        System.out.println(canReachEnd(A));
	}

}