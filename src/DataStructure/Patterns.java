package DataStructure;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1,n=5;
		
		for(int i=0;i<n;i++) {
			number=1;
			for(int j=0;j<=i;j++) {
				
				if(i%2==1) {
					System.out.print("* ");
				}
				else{
					System.out.print(number+" ");
					number++;
				}
				
				
				
			}
			System.out.println();
		}

	}

}
