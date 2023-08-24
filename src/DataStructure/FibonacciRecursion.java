package DataStructure;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		for(int i=0;i<num;i++) {
			System.out.println(fibrecur(i));
		}

	}
	
	static int fibrecur(int count) {
		if(count==0) {
			return 0;
		}
		if(count==1||count==2) {
			return 1;
		}
		return fibrecur(count-2)+fibrecur(count-1);
	}

}
