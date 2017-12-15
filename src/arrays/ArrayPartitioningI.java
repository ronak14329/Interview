/**
 * 
 */
package arrays;

import java.util.Arrays;

/**
 * @author Ronak Goyal
 *
 */
public class ArrayPartitioningI {

	/**
	 * @param args
	 */
	
	public static int arrayPartitioningI(int[] num){
	 int sum =0;
	 Arrays.sort(num);
	 for(int i =0 ;i< num.length ;i= i+2){
		 sum += num[i];
	 }
	 return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] input = {1,4,2,3};
     System.out.println(arrayPartitioningI(input));
	}

}
