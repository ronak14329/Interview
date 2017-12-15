package miscellaneous;

public class UniqueCharacter {
public boolean UniqueCharacters(String str){
	if(str.length()>256)return false;
	boolean [] res =  new boolean [256];
	for(int i=0;i<str.length();i++){
		int val =  str.charAt(i);
		if(res[val]){
			return false;
		}
		res[val]=true;
	}
	return true;
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s =  "MyNaMe";
      UniqueCharacter uni =  new UniqueCharacter();
    		  
      System.out.println(uni.UniqueCharacters(s));
	}

}
