/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class StringToInteger {

	/**
	 * @param args
	 */
	
	public static String intToString(int x){
		boolean isNegative = false;
		if(x < 0){
			x =-x;
			isNegative = true;
		}
		StringBuilder sb = new StringBuilder();
		do{
			sb.append((char)('0' + x % 10));
			x /= 10;
		} while(x !=0);
		  if(isNegative){
			  sb.append('-');
		  }
		sb.reverse();
		return sb.toString();
	}
	
	public static int stringToInt(String s){
		boolean isNegative = s.charAt(0)== '-';
		int result = 0;
		for(int i = s.charAt(0)=='-'?1:0;i<s.length();i++){
			int digit = s.charAt(i)-'0';
			result = result *10 + digit;
		}
		return isNegative ? -1*result :result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(intToString(45));
System.out.println(stringToInt("-54"));
	}

}
