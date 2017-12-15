/**
 * 
 */
package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ronak Goyal
 
 */
public class DistributeCandies {

	/**
	 * @param args
	 */
	 public static int distributeCandies(int []num){
		Set<Integer> set = new HashSet<>();
		for(int i =0 ;i< num.length;i++){
			set.add(num[i]);
		}
		if(set.size() == num.length/2)return set.size();
		return Math.min(set.size(), num.length/2);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] input = {1,4,2,2,2,3};
		  System.out.println(distributeCandies(input));
	}

}
