package miscellaneous;

public class ReverseString {

//	class Solution {
		public String reverseWords(String s) {
			if (s == null || s.length() == 0) {
				return "";
			}
	 
			// split to words by space
			String[] arr = s.split(" ");
			System.out.println(arr);
			StringBuilder sb = new StringBuilder();
			for (int i = arr.length - 1; i >= 0; --i) {
				if (!arr[i].equals("")) {
					sb.append(arr[i]).append(" ");
				}
			}
			return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		}
//	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseString s= new ReverseString();
String a="The sky is blue";
	System.out.println(s.reverseWords(a));	
	s.reverseWords(a);
		
	}

}
