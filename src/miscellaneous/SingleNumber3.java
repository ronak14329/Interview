package miscellaneous;

public class SingleNumber3 {
	public static int singleNumber(int[] A) {
	    int ones = 0, twos = 0, threes = 0;
	    for (int i = 0; i < A.length; i++) {
	        twos |= ones & A[i];
	        System.out.println(" the value of two "+twos);
	        ones ^= A[i];
	        System.out.println("the value of ones "+ ones);
	        threes = ones & twos;
	        System.out.println("The value of three "+threes);
	        ones &= ~threes;
	        System.out.println("the value of ones 2 "+ ones);
	        twos &= ~threes;
	        System.out.println(" the value of two 2 "+twos);
	        
	    }
	    return ones;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,5,1,2,3,1,2,3};
System.out.println(" the number is "+singleNumber(a));
int b=00111100;
int c =00001101;
int r=15;

System.out.println("the value of r "+~r);
int aq = b&c;
System.out.println(aq);
System.out.println(1&-1);
}
	}
