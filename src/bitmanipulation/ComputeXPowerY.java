/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class ComputeXPowerY {

	/**
	 * @param args
	 * time complexity is O(n) where n is the number of bits in y 
	 */
	
	
	public static double power(double x, double y){
		double result = 1.0;
		long power = (long) y;
		// if y ie negative
		if(y < 0){
			power = -power;
			x = 1.0/x;
		}
		
		while(power != 0){
			if((power & 1) != 0){
				result *= x;
			}
			x *= x;
			power >>>= 1;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(power(2,10));
	}

}
