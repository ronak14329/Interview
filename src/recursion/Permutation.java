/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronak Goyal
 *all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
public class Permutation {

	/**
	 * @param args
	 */
	
	public static List<List<Integer>> permutation( int[] num){
		List<List<Integer>> result = new ArrayList<>();
		helper(result, new ArrayList<Integer>(), num);
		return result;
	}
	private static void helper(List<List<Integer>> result, ArrayList<Integer> tempList, int[] num) {
		// TODO Auto-generated method stub
	 // when the length of the templist is equal to the length of nums
		// means all the number are covered so we add that in out result list
		if(tempList.size() == num.length){
			result.add(new ArrayList<Integer>(tempList));
		}
		else{
			for(int i =0 ;i< num.length; i++){
				if(tempList.contains(num[i]))continue;
				tempList.add(num[i]);
				helper(result,tempList,num);
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
         List<List<Integer>> res = permutation(nums);
         for(List a :res){
        	// for(int x : a){
        		 System.out.println(a +",");
        	// }
        	// System.out.println();
         }
	}

}
