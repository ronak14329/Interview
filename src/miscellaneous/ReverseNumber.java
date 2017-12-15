package miscellaneous;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
 * @author Anil Garg
 *
 */
public class ReverseNumber {
	public int reverse(int x) {
	    int rev = 0;
	    while(x != 0){
	        rev = rev*10 + x%10;
	        x = x/10;
	    }
	 
	    return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseNumber s = new ReverseNumber();
System.out.println("Ente the number");
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
try{
	int reverse = s.reverse(a);
	System.out.println(reverse);
	if(reverse==a){
		System.out.println("The number is a palindrome");
	}else{
		System.out.println("The number is not a palindrome");
	}
} catch(InputMismatchException exception){
	  System.out.println("This is not an integer");
	}
	}

}
