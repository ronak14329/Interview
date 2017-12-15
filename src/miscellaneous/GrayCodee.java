package miscellaneous;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GrayCodee {
	public static List<Integer> grayCode(int n) {
	    if(n==0){
	        List<Integer> result = new ArrayList<Integer>();
	        result.add(0);
	        return result;
	    }
	 
	    List<Integer> result = grayCode(n-1);
	    int numToAdd = 1<<(n-1);
	 
	    for(int i=result.size()-1; i>=0; i--){
	        result.add(numToAdd+result.get(i));
	    }
	 
	    return result;
	}
	  public static int findMaximumXOR(int[] nums) {
	        int max = 0, mask = 0;
	        for(int i = 31; i >= 0; i--){
	            mask = mask | (1 << i);
	            Set<Integer> set = new HashSet<>();
	            for(int num : nums){
	                set.add(num & mask);
	                System.out.println(num & mask);
	            }
	            int tmp = max | (1 << i);
	            System.out.println("Temp= "+tmp);
	            for(int prefix : set){
	                if(set.contains(tmp ^ prefix)) {
	                    max = tmp;
	                    System.out.println("Max= "+max);
	                    break;
	                }
	            }
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<Integer> grayCode = grayCode(3);
//	for(int n:grayCode){
//		System.out.println(n);
//	}
		int [] a ={3, 10, 5, 25, 2, 8};
	System.out.println(findMaximumXOR(a));
	}

}
