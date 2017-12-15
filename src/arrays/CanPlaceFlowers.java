/**
 * 
 */
package arrays;

/**
 * @author Ronak Goyal

 */
public class CanPlaceFlowers {

	/**
	 * @param args
	 */
	
	public static boolean canPlaceFlower(int [] flowerBed , int n){
		int count =0;
		for(int i = 0 ; i< flowerBed.length && count < n ; i++){
			if(flowerBed[i]!= 1){
				int next = i == flowerBed.length ? 0 : flowerBed[i+1];
				int prev = i ==0 ? 0 : flowerBed[i-1];
				if(prev == 0 && next == 0){
					count++;
					flowerBed[i]=1;
				}
			}
		}return count ==n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] input = {1,0,0,0,0,0,1};
   System.out.println(canPlaceFlower(input, 2));
   System.out.println(canPlaceFlower(input, 3));
	}

}
