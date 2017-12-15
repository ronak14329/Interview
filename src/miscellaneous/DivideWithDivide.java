package miscellaneous;

public class DivideWithDivide {
	public int divide(int dividend, int divisor) {
	    //handle special cases
	    if(divisor==0) return Integer.MAX_VALUE;
	    if(divisor==-1 && dividend == Integer.MIN_VALUE)
	        return Integer.MAX_VALUE;
	 
	    //get positive values
	    long pDividend = Math.abs((long)dividend);
	    long pDivisor = Math.abs((long)divisor);
	 
	    int result = 0;
	    while(pDividend>=pDivisor){
	        //calculate number of left shifts
	        int numShift = 0;    
	        while(pDividend>=(pDivisor<<numShift)){
	            numShift++;
	        }
	 
	        //dividend minus the largest shifted divisor
	        result += 1<<(numShift-1);
	        pDividend -= (pDivisor<<(numShift-1));
	    }
	 
	    if((dividend>0 && divisor>0) || (dividend<0 && divisor<0)){
	        return result;
	    }else{
	        return -result;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DivideWithDivide s= new DivideWithDivide();
s.divide(20, 5);
System.out.println(s.divide(20, 3));
int min = Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
System.out.println(min);
	System.out.println(max);
	}

}
