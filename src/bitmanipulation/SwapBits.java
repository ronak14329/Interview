/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class SwapBits {

	/**
	 * @param args
	 * Swap bits in a given number and i and j are index of bits to be swapped.
	 * T.C = O(1);  
	 */ 
	
	
	public static long swapBit(long x , int i , int j){
		// Check if the i and j bit are different or not
		if(((x >>> i)& 1) != ((x >>> j)& 1)){
			long bitMask = (1L << i) | (1L << j);
			x ^= bitMask;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(swapBit(48,4,0));
   
	}

}
