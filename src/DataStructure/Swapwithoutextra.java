package DataStructure;

import java.util.HashMap;

public class Swapwithoutextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		
		
		String st="this this is is to to check only shishpal and shishpal only only only";
		String[] arr=st.split("\\s");
		HashMap<String,Integer> hm= new HashMap<>();
		for(String word:arr){
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);

	}

}
