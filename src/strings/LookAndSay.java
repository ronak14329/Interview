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
public class LookAndSay {

	/**
	 * @param args
	 */
	
	public static String lookAndSay( int n){
		String s ="1";
		List<String > res = new ArrayList<String>();
		for( int i =1;i<n;i++){
			res.add(s);
			s = nextNumber(s);
		}
		return s;
	}
	
	public static String nextNumber(String s){
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++){
			int count =1;
			while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
				i++;
				count++;
			}
			sb.append(count);
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(lookAndSay(6));
	}

}
