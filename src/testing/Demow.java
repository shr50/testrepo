package testing;

public class Demow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=19;
		int rem=0;
		int sum=0;
		
		while(num>0) {
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		int rem2=0;
		int sum2=0;
		
		if(sum>9) {
			
			while(sum>0) {
				rem2=sum%10;
				sum2=sum2+rem2;
				sum=sum/10;
			}
			
			System.out.println(sum2);
			
		}
		else {
			System.out.println(sum);
		}
		

	}

}
