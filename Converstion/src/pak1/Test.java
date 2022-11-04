package pak1;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String [] students={"ali","kamil","adil"};
		ArrayList<String>studlist=new ArrayList<String >(Arrays.asList(students));
		
		studlist.add("atiqullah");
		studlist.add("hamraz");
		System.out.println(studlist);
//		collection class,ArrayList to simple array
		ArrayList<String >addlist=new ArrayList<String >();
		addlist.add("Helmand");
		addlist.add("kandahar");
		addlist.add("kabul");
		System.out.println(addlist);
		
		String [] add=new String[addlist.size()];
		addlist.toArray(add);
		for(String obj:add){
			System.out.println(obj);
		}
//		Heterogeneous list 
		ArrayList mylist=new ArrayList();
		mylist.add("ahmad");
		mylist.add(100);
		mylist.add('z');
		System.out.println(mylist);
		
		Object []obj=mylist.toArray();
		for(Object object:obj){
			System.out.println(object);
		}
		
		
		}
	}


