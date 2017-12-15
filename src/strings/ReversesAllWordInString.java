/**
 * 
 */
package strings;

/**
 * @author Ronak Goyal
 *
 */
public class ReversesAllWordInString {

	/**
	 * @param args
	 
Input: "Let's take LeetCode contest"
Output: "contest Leetcode take Let's"
	 */

	public static String reverseString(String s){
		char[] s1 = s.toCharArray(); // convert the String into character array
		reverse(s1,0,s1.length-1);
		int i = 0;// Initialize the counter
		for(int j = 0; j < s1.length; j++) // for loop to find the space and when find the space reverse the String from i to j
		{
			if(s1[j] == ' ') // checking the white Spacae
			{
				reverse(s1, i, j - 1);// calling the reverse function to reverse the substring which starts at1 and end at j-1
				i = j + 1; // reinitialize i=j+1 so that we can reverese the next word
			}
		}
		reverse(s1, i, s1.length - 1); // to reverse the last word
		return new String(s1);  // return the string
	}

	public static void reverse(char[] s, int l, int r)
	{
		while(l < r)
		{
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++; r--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = reverseString("Ronak Goyal is my name");
		System.out.println(a);
	}

}
