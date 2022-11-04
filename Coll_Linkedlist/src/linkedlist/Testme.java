package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Testme {

	public static void main(String[] args) {
		
		LinkedList<Book>list=new LinkedList<Book>();
		list.add(new Book(2, "java", "defles"));
		list.add(new Book(3, "c++", "javeed"));
		list.add(new Book(4, "c", "jan"));
		list.add(new Book(5, "network", "atiqullah"));
		
		System.out.println("print the from for each loop");
		for(Book obj:list){
		System.out.println(obj.id+" : " +obj.getBookname()+" : " +obj.getBookauther());
		
		}
		System.out.println("print the data from listiterator ...");
		ListIterator<Book>iterator=list.listIterator();
		while(iterator.hasNext()){
			Book obj=iterator.next();
	System.out.println(obj.id+" : " +obj.getBookname()+" : " +obj.getBookauther());


		}
		System.out.println("print the data from get method.... ");
		// get method only print one element
//	Book obj=list.get(3);
//	System.out.println(obj.id+" : " +obj.getBookname()+" : " +obj.getBookauther());

	// and we print all data by get method
	Book obj=null;
	for(int x=0;x<list.size();x++){
		obj=list.get(x);
		System.out.println(obj.id+" : " +obj.getBookname()+" : " +obj.getBookauther());

	}
	int A=(int )'A';
	int a=(int)'a';
	System.out.println(A);
	System.out.println(a);
	
	}

}
