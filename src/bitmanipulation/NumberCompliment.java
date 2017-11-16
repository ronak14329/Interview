/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class NumberCompliment {

	public static int numberComplement(int x){
		System.out.println(Integer.highestOneBit(x));
		System.out.println(Integer.highestOneBit(x)<< 1);
		int mask =  (Integer.highestOneBit(x)<< 1)-1;
		System.out.println(mask);
		return mask^ x;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(numberComplement(5));
	}

}
