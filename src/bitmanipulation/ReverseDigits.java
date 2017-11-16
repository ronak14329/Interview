/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class ReverseDigits {

	/**
	 * @param args
	 * time complexity is O(n) where n is the number of digit in the number.
	 */
	
	public static long reverse(int x){
		boolean isNegative = false;
		if(x<0)isNegative = true;
		long result = 0;
		long xRemaining = Math.abs(x);
		while(xRemaining != 0){
			result = result * 10 + xRemaining%10;
			xRemaining /= 10;
		}
		return isNegative ? -result :result ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("output = " + reverse(-512));
	}

}
