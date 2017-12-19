/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class LongestRepeatingCharacterreplacement {

	/**
	 * @param args
	 */
	
	public static int characterReplacement(String s, int k){
		if(s.length()==0)return 0;
		int len = s.length();
		int start =0;
		int maxCount =0;
		int maxLength =0;
		int [] count = new int[26];
		for(int i =0;i<len;i++){
			maxCount = Math.max(maxCount, ++count[s.charAt(i)-'A']); // to count the maximum count as well as store in the count array
			// it will check whether we have crossed the given k variable changes or not
			if(i-start -maxCount +1 >k){
				count[s.charAt(start)-'A']--;
				start++;
			}
			maxLength = Math.max(maxLength, i-start+1);
		}return maxLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str = "AAABACBAD";
           System.out.println(characterReplacement(str, 2));
	}

}
