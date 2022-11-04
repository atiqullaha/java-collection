package pak1;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		Vector<String >car=new Vector<String >();
		car.add("Honda");
		car.add("Toyta");
		car.add("loccil");
		
		Enumeration obj=car.elements();
		System.out.println("this is Normal enumeration ");
		while(obj.hasMoreElements()){
			String s=(String)obj.nextElement();
			System.out.println(s);
		}
		
		System.out.println("this is genric enumeration");
		Enumeration<String >obj1=car.elements();
		while(obj1.hasMoreElements()){
			String s=obj1.nextElement();
			System.out.println(s);
		}
	}

}
