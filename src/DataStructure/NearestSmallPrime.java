package DataStructure;

import java.util.ArrayList;

public class NearestSmallPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=78;
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int j=n-1;j>2;j--) {
			if(checkPrime(j)) {
				al.add(j);
			}
		}
		System.out.println(al.get(0));

	}
	
	static boolean checkPrime(int number) {
		boolean isprime=true;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
	}

}
