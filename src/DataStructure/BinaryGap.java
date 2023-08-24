package DataStructure;

public class BinaryGap {
	
	public void solution(int num) {
		String binar=Integer.toBinaryString(num);
		System.out.println(binar);
		
		
		//substring as substring(0,2) returns 0th and 1st index
		for (int i=0;i<binar.length();i++) {
			
			//String st=binar.substring(i,i+1);
			char sc=binar.charAt(i);
			System.out.println(sc);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap bg= new BinaryGap();
		bg.solution(9);

	}

}
