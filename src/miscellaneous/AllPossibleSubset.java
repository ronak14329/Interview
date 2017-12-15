package miscellaneous;
import java.util.ArrayList;
import java.util.Arrays;

public class AllPossibleSubset {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if (S == null)
			return null;
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			//get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			//add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			//add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		//add empty set
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AllPossibleSubset s= new AllPossibleSubset();
int [] a = {1,2,3};
ArrayList<ArrayList<Integer>> n = new ArrayList<ArrayList<Integer>>();
System.out.println("Enter the loop");
n=s.subsets(a);
for(ArrayList<Integer> h: n){
	System.out.print(h +",");
}

	}

}
