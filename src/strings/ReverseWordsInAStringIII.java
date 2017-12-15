/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 * 
Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAStringIII {

	/**
	 * @param args
	 */
	
	public static String reverseWord(String str){
		char[] s = str.toCharArray();
		int j =0;
		for(int i =0 ;i<s.length ;i++){
			if(s[i] == ' '){
				reverse(s,j,i-1);
				j = i+1;
			}
			
		}
		reverse(s,j,s.length-1);
		return new String(s);
	}
	
	public static void reverse(char[] s , int i , int j){
		while(i<j){
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String input = "Let's take LeetCode contest";
   System.out.println(reverseWord(input));
	}

}
