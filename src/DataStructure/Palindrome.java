package DataStructure;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generat = 0ed method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.next();
			int num=Integer.valueOf(s);
					
			int temp=num;
			int rem;
			int sum=0;
			
			while(num>0) {
				rem=num%10;
				sum=(sum*10)+rem;
				num/=10;
				
			}
			
			if(temp==sum) {
				System.out.println("this number is a palindrome");
			}
			else {
				System.out.println("this number is not a palindrome");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Palindrome pl=new Palindrome();
		System.out.println("Checking for palindrome in string");
		System.out.println("---------------------------------");
		pl.stringPalin("acda");
		

	}
	
	public void stringPalin(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("String: "+str+ "  is a palindrome");
		}
		else {
			System.out.println("String: "+str+ "  is not a palindrome");
		}
	}

}
