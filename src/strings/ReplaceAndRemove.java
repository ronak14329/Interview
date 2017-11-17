/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class ReplaceAndRemove {

	/**
	 * @param args
	 */
	
	public static String replaceAndRemove(String s){
		//String res = "";
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++){
			if(s.charAt(i)== 'a'){
				sb.append("dd");
			}else if(s.charAt(i)=='b'){
				sb.append("");
			}else{
				sb.append(s.charAt(i));
			}
		}
		//sb.reverse();
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(replaceAndRemove("aabcd"));
	}

}
