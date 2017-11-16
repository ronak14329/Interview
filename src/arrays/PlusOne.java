/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 * Time Complexity = O(n) where n is the length of the list
 */
public class PlusOne {
	
	public static List<Integer> plusOne(List<Integer> A){
		// find the length or size
		int len = A.size()-1;
	    // increment the last digit by one 
		A.set(len, A.get(len)+1);
		for(int i = len ; i>0 && A.get(i)== 10;i--){
			// last number if 10 then 1 carry and Zero at digit place
			A.set(i, 0);
			A.set(i-1, A.get(i-1)+1);
		}
		if(A.get(0)== 10){
			A.set(0, 0);
			A.add(0,1);
		}
		return A;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> num = new ArrayList<Integer>();
      for(int i =1 ;i<6;i++){
    	  num.add(i);
      }
      List<Integer> res = new ArrayList<Integer>();
      res = plusOne(num);
      for(int i: res){
    	  System.out.println(i);
      }
	}

}
