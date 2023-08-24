package DataStructure;

import java.util.HashMap;

public class OccOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strn="This This is to is a task not to be done by Akhilesh to Akhilesh but Shishpal";
	    HashMap<String,Integer> hm= new HashMap<>();
	    String[] words= strn.split("\\s");
	    for(String word:words){
	      if(hm.containsKey(word)){
	        hm.put(word, hm.get(word)+1);
	      }
	      else{
	        hm.put(word,1);
	      }
	    }
	    System.out.println(hm);

	}

}
