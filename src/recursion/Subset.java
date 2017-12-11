/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *  Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
public class Subset {

	/**
	 * @param args
	 */
	
	public static List<List<Integer>> subset(int []nums){
		List<List<Integer>> result = new ArrayList<>();
		backtrack( result, new ArrayList<Integer>(), nums ,0);
		return result;
	}
	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));   // adding the templist to the list so that the value in the templist can be appended
	    for(int i = start; i < nums.length; i++){  // start for loop to cover all the possible combination
	        tempList.add(nums[i]);                  // appending the new element in the tempList.
	        backtrack(list, tempList, nums, i + 1);   // calling the backtrack function again eith the start value incremented by 1.
	        tempList.remove(tempList.size() - 1);  // remove the last entry of the templist.
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] nums ={1,2,3};
        List<List<Integer>> res = subset(nums);
        for(List a :res){
       	// for(int x : a){
       		 System.out.println(a +",");
       	// }
       	// System.out.println();
        }
        
	}

}
