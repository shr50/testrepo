package DataStructure;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,3,8,8,66,55,44,5,67,67,32,54,78};
		int sz=arr.length;
		System.out.println(sz);
		Arrays.sort(arr);
		
		for(int i=sz-2;i>0;i--) {
			if(arr[i]!=arr[i+1]){
				System.out.println("second largest number is: "+arr[i]);
				break;
			}
		}

	}

}

