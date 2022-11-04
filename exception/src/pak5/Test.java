package pak5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		int arr []=null;
	
		try {
			int x=arr.length;
			System.out.println(x);
			
			
			
			System.out.println(10/0);
			FileInputStream file=new FileInputStream("khan.txt");
		} catch (FileNotFoundException|ArithmeticException e ) {
			System.out.println(e);
		}

	}

}
