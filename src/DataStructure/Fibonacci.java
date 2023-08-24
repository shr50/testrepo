package DataStructure;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,sum=0;
		int num=10;
		int i=0;
		while(i<num) {
			System.out.println(first+" ");
			sum=first+second;
			first=second;
			second=sum;
			i++;
		}

	}

}
