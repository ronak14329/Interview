/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class ParityOfBinaryNumber {

	/**
	 * @param args
	 */
	
	public static short parity(long x){
		short result =0;
		while(x!=0){
			result ^= (x&1);
			x = x>>1;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parity(5));
		System.out.println(parity(7));
	      
	}

}
