/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class PermutationInString {

	/**
	 * @param args
	 */
	
	public static boolean checkInclusion(String s1, String s2){
		// check the length s1 should always be smaller or equal to s2.
	  if(s1.length()> s2.length())return false;
	   // create a s1map for s1 string
	  int [] s1map = new int[26];
	  for(int i = 0;i<s1.length();i++)s1map[s1.charAt(i)-'a']++;
	  
	  for(int i =0;i<s2.length()-s1.length();i++){
		  int []s2map = new int [26];
		  for(int j=0;j<s1.length();j++){
			  s2map[s2.charAt(i+j) - 'a']++;
		  }
		  if(matches(s1map, s2map))return true;
	  }
	  return false;
	}
	 public static boolean matches(int []s1map, int[] s2map){
		 for( int i =0 ;i<26 ;i++){
			 if(s1map[i] != s2map[i])return false;
		 }return true;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(checkInclusion("abc", "ronacabcb"));
	}

}
