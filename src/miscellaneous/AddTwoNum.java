package miscellaneous;
import java.util.Arrays;

public class AddTwoNum {
	public String removeDuplicateLetters(String s) {
        char [] c = s.toCharArray();
       Arrays.sort(c);
       for (int i = 0; i < c.length; i++) {
		
		System.out.println(c[i]);
	}
        boolean [] freq = new boolean [256];
        StringBuilder  dup = new StringBuilder();
    for(char x :c){
        if(freq[x-'A']){
           
        }else{
            freq[x-'A']=true;
            dup.append(x);
        }
    }
    
    
    return dup.toString();
        
    }
	 public int[] singleNumber(int[] nums) {
	        // Pass 1 : 
	        // Get the XOR of the two numbers we need to find
	        int diff = 0;
	        for (int num : nums) {
	            diff ^= num;
	        }
	        System.out.println("diff = "+diff);
	        // Get its last set bit
	        diff &= -diff;
	        System.out.println("diff after ="+diff);
	        // Pass 2 :
	        int[] rets = {0, 0}; // this array stores the two numbers we will return
	        for (int num : nums)
	        {
	            if ((num & diff) == 0) // the bit is not set
	            {System.out.println("r1 "+rets[0]);
	                rets[0] ^= num;
	            }
	            else // the bit is set
	            {
	                rets[1] ^= num;
	            }
	        }
	        return rets;
	    }
	 public int reverseBits(int n) {
		    if (n == 0) return 0;
		    
		    int result = 0;
		    for (int i = 0; i < 32; i++) {
		    	System.out.println(" i = "+i);
		    	System.out.println("result pre = "+result);
		        result <<= 1;
		        System.out.println( "Result after = "+result);
		        if ((n & 1) == 1) result++;
		        System.out.println("Result afeter = "+result);
		        n >>= 1;
		        System.out.println( "the valur of n = "+n);
		    }
		    System.out.println("the ouptut is = "+result);
		    return result;//
		}
	public int addTwo(int a, int b){
		if (a == 0) return b;
		if (b == 0) return a;

		while (b != 0) {
			int carry = a & b;
			System.out.println("Carry = " +carry);
			a = a ^ b;
			System.out.println("the value of a " +a);
			b = carry << 1;
			System.out.println("The value of b "+b);
		}
		
		return a;
		
		
	}
	 public String toHex(int num) {
	        long n = num & 0x00000000ffffffffL; 
	        System.out.println(" the value of n  ="+n);
	        // dont why we use it
	        char[] map = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
	        StringBuilder sb = new StringBuilder();
	        while (n > 0) {
	            sb.insert(0, map[(int) (n % 16)]);
	            n = n / 16;
	        }
	        return num == 0 ? "0" : sb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddTwoNum x= new AddTwoNum();
String s = "bcbac";
System.out.println(x.removeDuplicateLetters(s));
	}

}
