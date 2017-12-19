/**
 * 
 */
package arrays;

/**
 * @author Ronak Goyal
 *  Input: [1, 5, 11, 5]

Output: true

 */
public class PartitionEqualSubsetSum {

	/**
	 * @param args
	 */
	
	
	public static boolean canPartition(int [] arr){
		int sum =0;
		for(int i : arr)sum += i;
		if(sum % 2!=0)return false;
		sum = sum/2;
		
		boolean T [][] = new boolean[arr.length+1][sum+1];
		for(int i =0;i<arr.length;i++){
			T[i][0] = true;
		}
		for(int i =1;i <=arr.length;i++){
			for(int j =1;j<=sum;j++){
				if(j-arr[i-1] >=0){
					T[i][j]= T[i-1][j-arr[i-1]] || T[i-1][j];
				}else{
					T[i][j] = T[i-1][j];
				}
			}
		}return T[arr.length][sum];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] input ={1,5,11,5};
System.out.println(canPartition(input));
	}

}

