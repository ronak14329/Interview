/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ronak Goyal
 * Example:
Input: 
[[1,2,2,1],
 [3,1,2],
 [1,3,2],
 [2,4],
 [3,1,2],
 [1,3,1,1]]
Output: 2
Explanation: 

 */
public class BrickWalls {

	/**
	 * @param args
	 */
	
	 public static int leastBricks(List<List<Integer>> wall) {
	       if(wall.size()== 0)return 0;
	        Map<Integer,Integer> map = new HashMap<>();
	        int max =0; // counter to find the maximum number of brick in line
	         for(List<Integer> list : wall){
	             int length =0;  // to cal culate the length from starting to the brick on every i
	             for(int i =0; i<list.size()-1;i++){
	                 length += list.get(i);  // adding brick to length
	                 map.put(length,map.getOrDefault(length,0)+1); // saving the same length in the map and increment the max counter.
	                 max = Math.max(max, map.get(length));  
	             }
	         }return wall.size()-max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> input = new ArrayList<>();
		List<Integer> in = new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(2);
		in.add(1);
		List<Integer> in1 = new ArrayList<>();
		in1.add(3);
		in1.add(1);
		in1.add(2);
		
		List<Integer> in2 = new ArrayList<>();
		in2.add(1);
		in2.add(3);
		in2.add(2);
		
		List<Integer> in3 = new ArrayList<>();
		in3.add(2);
		in3.add(4);
		
		List<Integer> in4 = new ArrayList<>();
		in4.add(3);
		in4.add(1);
		in4.add(2);
		
		List<Integer> in5 = new ArrayList<>();
		in5.add(1);
		in5.add(3);
		in5.add(1);
		in5.add(1);
		input.add(in);
		input.add(in1);
		input.add(in2);
		input.add(in3);
		input.add(in4);
		input.add(in5);
		for(List<Integer> list : input){
			for(int i :list){
				System.out.print(i+",");
			}
			System.out.println();
		}
		System.out.println("The minimum is  "+leastBricks(input));
		
		
	}

}
