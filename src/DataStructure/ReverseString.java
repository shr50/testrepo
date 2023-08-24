package DataStructure;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String st="this if for demo";
//		String rst="";
//		char[] ch=st.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			rst=rst+ch[i];
//		}
//		
//		System.out.println("reversed string is: "+rst);
		
		String str="this is a demo for reverse";
		char[] chr=str.toCharArray();
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
			//rev=chr[i]+rev;    //if loop is on chr
		}
		System.out.println(rev);
		
		String str1="this is for words";
		String revwords="";
		String[] words=str1.split("\\s");
		for(int j=0;j<words.length;j++) {
			revwords=words[j]+" "+revwords;
		}
		
		System.out.println(revwords);

	}

}
