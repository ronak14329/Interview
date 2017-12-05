/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class SnakesString {

	/**
	 * @param args
	 * Write a String sinusoidally
	 * time complexity is O(n)
	 */
	
	public static String snakesString(String s){
		StringBuilder sb = new StringBuilder();
		for(int i =1;i<s.length();i=i+4){
			sb.append(s.charAt(i));
		}
		for(int i =0;i<s.length();i +=2){
			sb.append(s.charAt(i));
		}
		for(int i =3;i<s.length();i +=4){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(snakesString("Hello World"));
	}

}
