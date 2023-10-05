package DataStructure;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArmstrongNumber arm=new ArmstrongNumber();
		int count=0;
		int number=153;
		int tnum=number;
		int sum=0;
		
		//finding the number of digits
		//put this in a new method 
		while(tnum>0) {
			tnum=tnum/10;
			count++;
		}
		
		System.out.println("number of digits are:" +count);
		System.out.println(arm.powercalc(2,3));
	}
	
	public int powercalc(int base,int exponent) {
		int pow=1;
		
		for(int i=0;i<exponent;i++) {
			pow=pow*base;
			
		}
		return pow;
		
	}

}
