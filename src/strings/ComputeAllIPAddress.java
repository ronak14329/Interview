/**
 * 
 */
package strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *
 */
public class ComputeAllIPAddress {

	/**
	 * @param args
	 */

	public static List<String> getValidIPAddress(String s){
		List<String> result = new ArrayList<String>();
		// we need to use 3 nested loops where each loop traverse from 1 to 4
		for(int i = 1 ;i <4 && i<s.length();i++){
			String first = s.substring(0, i);
			// check whether the substring is valoid or not
			if(isValidPart(first)){
				for( int j =1;i+j<s.length()&& j<4;j++){
					String second = s.substring(i, i+j);
					if(isValidPart(second)){
						for(int k=1; i+j+k <s.length() && k<4; k++){
							String third = s.substring(i+j, i+j+k);
							String fourth = s.substring(i+j+k);
							if(isValidPart(third) && isValidPart(fourth)){
								result.add(first + "." +second +"."+third+"."+fourth);
							}
						}
					}
				}

			}
		}return result;
	}

	public static boolean isValidPart(String s){
		if(s.length()>3){
			return false;
		}
		if(s.charAt(0)=='0' && s.length()>1){
			return false;
		}
		int val = Integer.parseInt(s);
		return val <=255 && val>=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = getValidIPAddress("19216811");
		for(String s: res){
			System.out.println(s);
		}
	}

}
