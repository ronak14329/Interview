/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class SpreadSheetColumnToNumber {

	/**
	 * @param args
	 */

	public static int excelToNumber(String s){
		int res= 0;
		for( int i =0;i<s.length();i++){
			res = res * 26 + s.charAt(i)- 'A'+1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(excelToNumber("AA"));
	}

}
