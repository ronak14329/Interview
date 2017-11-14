/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class CountNumberOfOneBit {

	/**
	 * @param args
	 */
	
	public static short parity(long x){
		short result =0;
		short count =0;
		while(x!=0){
			result ^= 1;
			count++;
			x = x&(x-1); 
		}
		System.out.println("count = " +count);
		return result;
	}
	
//	public static short parityCheck(long x){
//		final int WORD_SIZE = 16;
//		final int BIT_MASK = 0xFFFF;
//		
//		return (short)(precomputedParity[(int)((x >>> (3 * WORD_SIZE)) & BIT_MASK)] ^
//				precomputedParity[(int)((x >>> (2 * WORD_SIZE)) & BIT_MASK)] ^
//				precomputedParity[(int)((x >>> (1 * WORD_SIZE)) & BIT_MASK)]^
//				precomputedParity[(int)((x  & BIT_MASK)]);
//	}
	
	public static short parityCheck(long x){
		x ^= x >>> 32;
		x ^= x >>> 16;
		x ^= x >>> 8;
		x ^= x >>> 4;
		x ^= x >>> 2;
		x ^= x >>> 1;
		
		return (short)(x & 0x1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(parity(5));
System.out.println(parity(7));
System.out.println(parityCheck(7));

System.out.println("Hi = "+((1L << 5) | (1L << 4)));
	}

}
