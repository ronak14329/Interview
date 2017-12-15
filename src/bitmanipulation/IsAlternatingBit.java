/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class IsAlternatingBit {

	/**
	 * @param args
	 */
	
    public static boolean isAlternatingBits(int n){
    	int result = n &1;
    	n = n>>1;
    	while(n !=0){
    		int x = n&1;
    		result ^= x;
    		n = n>>1;
    		if(result ==0)return false;
    		result =x;
    	}
    	return n==0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isAlternatingBits(5));
       System.out.println(isAlternatingBits(7));
	}

}
