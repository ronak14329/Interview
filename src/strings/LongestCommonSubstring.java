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
public class LongestCommonSubstring {

	/**
	 * @param args
	 */
	
	public static List<String> lcs(String s1, String s2){
		Integer match[][] = new Integer [s1.length()][s2.length()];
		int len1 = s1.length();
		int len2 = s2.length();
		int max = Integer.MIN_VALUE;
		ArrayList<String> result = null;
		for( int i =0;i<len1;i++){
			for(int j =0 ; j<len2 ;j++){
				if(s1.charAt(i)== s2.charAt(j)){
					if(i==0 || j==0)match[i][j]=1;
					else match[i][j]= match[i-1][j-1]+1;// diagonal element
					
					if(match[i][j] >max){
						max = match[i][j];
						result = new ArrayList<String>();
						result.add(s1.substring(i-max+1, i+1));
					}else if(match[i][j]==max){
						result.add(s1.substring(i-max+1, i+1));
					}
				}else match[i][j]=0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> res = lcs("LCLC","CLCL");
      for(String s:res){
    	  System.out.print(s +",");
      }
	}

}
