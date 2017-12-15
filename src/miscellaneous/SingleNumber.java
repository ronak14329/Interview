package miscellaneous;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

Java Solution 1

The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. Finally only one number left.
 * @author Anil Garg
 *
 */
public class SingleNumber {

	
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
	public static int singleNumber1(int[] A) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : A) {
			if (!set.add(n))
				set.remove(n);
		}
		Iterator<Integer> it = set.iterator();
		return it.next();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,1,2,2,3,4,4,3,5};
System.out.println(singleNumber(a));
System.out.println(singleNumber1(a));
	}

}