package DataStructure;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords rw=new ReverseWords();
		rw.revWordback("hard and fast rule from back loop");
		rw.revWordfront("hard and fast rule from front loop");

	}
	public void revWordback(String str) {
		String[] words=str.split("\\s");
		String temp="";
		
	//ystem.out.println(words);
		for(int i=words.length-1; i>=0;i--) {
			
			//System.out.println(words[i]);
			temp=temp+" "+words[i];
		}
		System.out.println(temp);
	}
	
	public void revWordfront(String str) {
		String[] words=str.split("\\s");
		String temp="";
		
	//ystem.out.println(words);
		for(int i=0; i<words.length;i++) {
			
			//System.out.println(words[i]);
			temp=words[i]+" "+temp;
		}
		System.out.println(temp);
	}

}
