package miscellaneous;
import java.util.Scanner;
/**
 * Implement pow(x, n).
 * @author Anil Garg
 *
 */
public class Power {
	 public int pow(int x, int n) {
	        int result = 1;

	        while (n > 0) {
	            if (n % 2 != 0) {
	                result = result * x;
	            }

	            x = x * x;
	            n = n / 2;
	        }

	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] na = {1,2,3,4,5,6,7};
//		String s1 = "12345678";
//		System.out.println(" the length of the given iinteger os "+na.length + " the length od String i " + s1.length());
		System.out.println("Ente the number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Ente the number");
		int b =scan.nextInt();
Power s= new Power();
s.pow(a, b);
System.out.println(s.pow(a, b));
	}

}
