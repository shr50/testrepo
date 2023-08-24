package DataStructure;

import java.util.Arrays;

public class demo {
	

	public static void main(String[] args) {
//		int decimal=11;
//		decimal=(int)Math.ceil((double)decimal/2);
//		System.out.println(decimal);
//		
//		String s1="shishpal";
//		int a1=5;
//		String s1="shishpal1";
//		System.out.println(s1);
//		System.out.println(s2);
		
		int[] arr= {3,2,4,5,1,6,6,8,9,4,77,3,7,44,7,57,9};
		Arrays.sort(arr);
		int l=arr.length;
		System.out.println(arr[l-2]);
	}

}
