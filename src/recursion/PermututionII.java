/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ronak Goyal
 *  Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */
public class PermututionII {

	/**
	 * @param args
	 */
	
	public static List<List<Integer>> permutationII(int [] nums){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		helper(result, new ArrayList<Integer>(), nums, new boolean[nums.length] );
		return result;
		
	}
	private static void helper(List<List<Integer>> result, ArrayList<Integer> tempList, int[] nums, boolean[] used) {
		// TODO Auto-generated method stub
		if(tempList.size() == nums.length){
			result.add(new ArrayList<>(tempList));
		}
		else{
			for(int i =0;i<nums.length;i++){
				if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1])continue;
				used[i] = true;
				tempList.add(nums[i]);
				helper(result, tempList,nums, used);
				used[i]= false;
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
        List<List<Integer>> res = permutationII(nums);
        for(List a :res){
       	// for(int x : a){
       		 System.out.println(a +",");
       	// }
       	// System.out.println();
        }
	}

}
