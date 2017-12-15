/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 
 */
public class LongestUnCommonSubsequence {

	/**
	 * @param args
	 */
	
	public static int longestUncommonSubsequence(String a, String b){
		return a.equals(b)? -1 : Math.max(a.length(), b.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("The length is "+ longestUncommonSubsequence("abcd", "bcd"));
	}

}
