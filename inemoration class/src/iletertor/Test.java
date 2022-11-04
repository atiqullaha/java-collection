package iletertor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String >list=new ArrayList<String>();
		list.add("ali");
		list.add("khan");
		list.add("mohmmad");
		list.add("thair");
		System.out.println("this is Normal iterator ");
		Iterator iterator1=list.iterator();
		while(iterator1.hasNext()){
			String st=(String)iterator1.next();
			System.out.println(st);
			
		}
		System.out.println("this is genric iterator");
		Iterator<String>iter=list.iterator();
		while(iter.hasNext()){
			String st1=iter.next();
			System.out.println(st1);
		}
		
		
	}

}
