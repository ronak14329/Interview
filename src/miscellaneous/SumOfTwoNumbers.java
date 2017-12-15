package miscellaneous;
import java.util.HashMap;

public class SumOfTwoNumbers {
	 public int[] twoSum(int[] numbers, int target) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[] result = new int[2];
		 
			for (int i = 0; i < numbers.length; i++) {
				if (map.containsKey(numbers[i])) {
					int index = map.get(numbers[i]);
					result[0] = index ;
					result[1] = i;
					break;
				} else {
					map.put(target - numbers[i], i);
				}
			}
		 
			return result;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SumOfTwoNumbers n = new SumOfTwoNumbers();
int [] num ={6,8,7,3};
int target = 10;
int [] r =n.twoSum(num, target);
System.out.println(n);
for(int a :r){
	System.out.println(a);
	System.out.println(num[a]);
}
	}

}
