/**
 * 
 */
package arrays;

/**
 * @author Ronak Goyal
 *
 */
public class FindPivotIndex {

	/**
	 * @param args
	 */
	
	public static int findPivot(int[]  num){
		int sum =0;
		int leftSum =0;
		for(int i :num)sum +=i;
		for(int i =0; i<num.length;i++){
			if(leftSum == sum - leftSum -num[i])return i;
			leftSum += num[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] input ={1,7,3,6,5,6};
  System.out.println("The pivot index is = "+findPivot(input));
	}

}
