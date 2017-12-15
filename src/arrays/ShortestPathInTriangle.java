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
public class ShortestPathInTriangle {

	/**
	 * @param args
	 */
	
	public static int shortestPath(List<List<Integer>> triangle){
	     int[] A = new int [triangle.size()+1];
	        for(int i=triangle.size()-1;i>=0;i--){
	            for(int j=0;j<triangle.get(i).size();j++){
	                A[j]= Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	            }
	        }
	        return A[0];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<List<Integer>> input = new ArrayList<>();
    int  count =2;
    for(int i = 0 ; i < 4 ;i++){
    	List<Integer> res = new ArrayList<>();
    	for(int j = 0 ; j<i+1;j++){
    		
    		res.add(count);
    		count++;
    	}
    	input.add(res); 
    }
    
    for(List r : input){
    	System.out.println(r);
    }
    System.out.println(shortestPath(input));
    
     
     
	}

}
