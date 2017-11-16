/**
 * 
 */
package bitmanipulation;

/**
 * @author Ronak Goyal
 *
 */
public class IsNumberAPalindrome {

	/**
	 * @param args
	 */
	
	public static boolean isPalindrome(int x){
		if(x < 0 )return false;
		if(x == 0) return true;
		int r = Math.abs(x);
		int s =0;
		while(r !=0){
			s = s*10 + r%10;
			r = r/10;
		}
		return s==x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome(525));
	}

}
