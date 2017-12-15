/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ronak Goyal
  contain duplicates, nums, return all possible subsets (the power set).


For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */
public class SubsetII {

	/**
	 * @param args
	 */
	 public static List<List<Integer>> subsetII(int []nums){
		 List<List<Integer>> result = new ArrayList<>();
		 Arrays.sort(nums);
		 backtrack(result, new ArrayList<>(), nums , 0);
		 return result;
	 }
	 
	 private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
		    list.add(new ArrayList<>(tempList));
		    for(int i = start; i < nums.length; i++){
		        if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
		        tempList.add(nums[i]);
		        backtrack(list, tempList, nums, i + 1);
		        tempList.remove(tempList.size() - 1);
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] nums ={1,2,1};
	        List<List<Integer>> res = subsetII(nums);
	        for(List a :res){
	       	// for(int x : a){
	       		 System.out.println(a +",");
	       	// }
	       	// System.out.println();
	        }
	}

}
