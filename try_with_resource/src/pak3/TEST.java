package pak3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.InflaterOutputStream;

import pak1.exam;

public class TEST {
	
	
public void method2() throws InterruptedException ,FileNotFoundException{
	System.out.println("this is the method2 ");
	
	Thread.sleep(3000);
	
	FileInputStream file=new FileInputStream("khan.txt");
}
	
public void method1() {
	System.out.println("this is the method1 ");
	
	try{
	method2();
	}catch(InterruptedException | FileNotFoundException e){
		System.out.println("both file heandled ");
	}
}

	public static void main(String[] args){
		
		TEST obj=new TEST();
		obj.method1();
	}

}
