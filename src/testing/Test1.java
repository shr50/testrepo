package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr= {"ab","cd","ef"};
		Integer[] intarr= {1,2,3,4,5};
		
		ArrayList<String> als= new ArrayList<String>();
		ArrayList<Integer> ali= new ArrayList<Integer>();
		
		//List<Integer> al = Arrays.asList(intarr);
		Collections.addAll(ali, intarr);
		
		Collections.addAll(als, strarr);
		System.out.println(als);
		System.out.println(ali);
		
//		for(int j=0;j<arr.length;j++) {
//			al.add(arr[j]);
//		}
//		
//		System.out.println(al);
		
//		ArrayList<Integer> al= new ArrayList<>();		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//		

	}
	public static void temp() {
		System.out.println("inside temp of Test1");
		//return true;
	}
	
	

}

class test2 extends Test1{
	
public static void main(String[] args) {
		System.out.println("main of test2");
		Test1.temp();
		//System.out.println(Test1.temp());
	}
}




//select salary from employee order by salary limit 3,1;
//select salary from employee order by salary where rownum='4';
//
//
//
//
//select s.id from salary s inner join employee e on s.id=e.empid where s.id=
//(select avg(sal) from salary group by(salary.dept));
