package miscellaneous;
import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
private static Map<Integer,Integer> cache = new HashMap<>();
 
public static int calStairs(int n){
	return helper(n);
}
private static int helper(int n){
	if(cache.containsKey(n)){
		return cache.get(n);
	}else {
		if(n<2)return 1;
		else if(n==2)return 2;
		
	}
	int ways = helper(n-1)+helper(n-2)+helper(n-3);
	if(!cache.containsKey(n)){
		cache.put(n, ways);
	}
	return ways;
}
public static int climbstairs(int n){
	int[]table =new int[n+1];
	table[0]=1;
	table[1]=1;
	table[2]=2;
	for(int i=3;i<n+1;i++){
		table[i]=table[i-1]+table[i-2]+table[i-3];
	}
	return table[n];
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(calStairs(3));
System.out.println(climbstairs(4));
	}

}
