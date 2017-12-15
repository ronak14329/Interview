package miscellaneous;

public class NumberCompliment {
	
	
	 public static int findComplement(int num) {
		 System.out.println(" highest bit "+(Integer.highestOneBit(10) << 1));
	        int mask = (Integer.highestOneBit(num) << 1) - 1;
	        System.out.println("mask " +mask);
	        System.out.println("num " +num);
	        num = ~num;
	        System.out.println("num " +num);
	        return num & mask;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int z =findComplement(10);
System.out.println("z "+z);
int n=10;
System.out.println("~n"+~n);
	}

}
