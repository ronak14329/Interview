package miscellaneous;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	public static ArrayList<Integer> prime = new ArrayList<Integer>();
	
public static ArrayList<Integer> PrimeNum(int n){
	//ArrayList<Integer> prime = new ArrayList<Integer>();
	
	int primenums =2;
	prime.add(primenums);
	while(prime.size() < n){
		primenums +=1;
		if(isPrime(primenums))
			prime.add(primenums);
	
	}
	
	for(Integer c:prime){
		System.out.println("The number is " +c);
	}
	
	return prime;
	
	
}
// this will take O(n2)
//public static boolean isPrime(int n){
//	for(int i =2;i<n;i++){
//		if(n%i==0){
//			return false;
//		}
//	}
//	return true;
//}
// This will reduce the time as we are now reduced the number of comaprsion and the loop size
//public static boolean isPrime(int n){
//	for(int i=2;i<=Math.sqrt(n);i++){
//		if(n%i==0)
//			return false;
//	}
//	return true;
//			
//}
//This method will further ooptimize the running time
//public static boolean isPrime(int n){
//	if(n%2==0)return false;
//	for(int i=3;i<=Math.sqrt(n);i++){
//		if(n%i==0){
//			return false;
//		}
//	}return true;
//}

public static boolean isPrime(int n ){
	for(int i=0;prime.get(i)<=Math.sqrt(n);i++){
		if(n%prime.get(i)==0){
			return false;
		}
	} 
	return true;
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value of n");
	Scanner scan =new Scanner (System.in);
	int x = scan.nextInt();
	PrimeNum(10);
	
	}

}
