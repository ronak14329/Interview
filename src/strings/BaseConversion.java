/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class BaseConversion {

	/**
	 * @param args
	 * Convert the given number from one base to another base.
	 */

	public static String convertBase(String s, int b1, int b2){
		boolean isNegative = s.charAt(0)=='-';
		int x =0;
		// first convert it into a normal numbers.
		for(int i = isNegative? 1 :0;i<s.length();i++){
			x = x* b1;
			x += Character.isDigit(s.charAt(i))? s.charAt(i)- '0' : s.charAt(i) - 'A' + 10;
		}

		// now convert it into the desireed base
		StringBuilder result = new StringBuilder();

		do{
			int remainder = x% b2;
			result.append((char)(remainder >= 10 ? 'A' + remainder -10 : '0' + remainder));
			x = x/b2;
		}while(x!=0);

		if(isNegative){
			result.append('-');
		}
		result.reverse();
		return result.toString();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertBase("1111" ,2 ,10));

	}

}
