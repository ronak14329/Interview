/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class IsPalindromeString {

	/**
	 * @param args
	 */
	
	public static boolean isPalindrome(String s){
		if(s.length()== 0 || s.length()==1 || s == null)return true;
		int i =0;
		int j = s.length()-1;
		while(i<j){
			while(i<j && !Character.isLetterOrDigit(s.charAt(i)))i++;
			while(i<j && !Character.isLetterOrDigit(s.charAt(j)))j--;
			if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j)))return false;
			i++;j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome("Canac"));
	}

}
