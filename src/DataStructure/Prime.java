package DataStructure;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		boolean isprime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		}
		System.out.println(num+" : is prime--"+isprime);
	}
	
//	boolean checkPrime(int number) {
//		boolean isprime=true;
//		for(int i=2;i<number/2;i++) {
//			if(number%i==0) {
//				isprime=false;
//				break;
//			}
//		}
//		return isprime;
//	}

}
