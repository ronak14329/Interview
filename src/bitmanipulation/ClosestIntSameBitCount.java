/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class ClosestIntSameBitCount {

	/**
	 * @param args
	 * Time Complexity is O(n) where n is the integer width
	 */
	
	public static long closestSameBit(long x){
		for(int i =0;i<63;i++){
			if((((x >> i)& 1) != ((x >> (i+1))& 1))){
			x ^= (1L << i) | (1L << (i+1));
			return x;
			}
		}
		throw new IllegalArgumentException("All bits are 0 or 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(closestSameBit(8));
     int t = 7;
     int p = 7;
     int o = t | p;
     
     System.out.println("output = "+o);
	}

}
