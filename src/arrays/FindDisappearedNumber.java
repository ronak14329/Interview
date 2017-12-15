/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *
 */
public class FindDisappearedNumber {

	/**
	 * @param args
	 * time compalexity is O(n)
	 * Space complexity is O(1) 
	 */
	
	public static List<Integer> findDisapearNum(int [] num){
		List<Integer> res = new ArrayList<>();
		for(int i =0;i<num.length;i++){
			int val = Math.abs(num[i])-1;
			if(num[val] > 0){
				num[val] = -num[val];
			}
		}
		for(int i =0;i<num.length;i++){
			if(num[i]>0) res.add(i+1);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] input = {4,3,2,7,8,2,3,1};
       List<Integer> res = findDisapearNum(input);
       System.out.print("The disappeared number is ");
       for(int i: res){
    	   System.out.print(i+",");
       }
	}

}
