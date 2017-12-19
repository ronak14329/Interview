/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author Ronak Goyal
 *
 */
public class DailyTemperatures {

	/**
	 * @param args
	 */
	   public static int[] dailyTemperatures(int[] temperatures) {
	       int res [] = new int [temperatures.length];
	        Arrays.fill(res,0);
	        int len = temperatures.length;
	        for(int i =0;i<len ;i++){
	            int j =i+1;
	            while(j < len && temperatures[i] >= temperatures[j] ){
	                j++;
	                
	            }
	            if( j != len )res[i] = j-i;
	        }return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []temp = {73,74,75,71,69,72,76,73};
      int [] res= dailyTemperatures(temp);
      for(int i :res){
    	  System.out.print(i+",");
      }
	}

}
