package DataStructure;

public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=43789;
		int sum=0;
		
		while(num>0||sum>9) {
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("single digit sum is: "+sum);

	}

}
