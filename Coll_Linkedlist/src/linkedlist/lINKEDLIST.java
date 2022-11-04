package linkedlist;

import java.util.LinkedList;

public class lINKEDLIST {

	public static void main(String[] args) {
		
		LinkedList<String>list=new LinkedList<String>();
		list.add("Honda");
		list.add("Tyota");
		list.add("SOzaki");// add data to first location
		System.out.println(list);
		list.addFirst("Mazda");// add data to last location
		System.out.println(list);
		list.addLast("loccel");
		System.out.println(list);
		
		list.add(3,"Folder");// Specific add data location
		System.out.println(list); 
		
		list.set(4, "van"); // replace data 
		System.out.println(list);
	
		list.remove(); // remove data 
		System.out.println(list);
		
		list.remove(4); //remove specific location data
		System.out.println(list);
		
		list.removeFirst();// remove first data 
		System.out.println(list);
		
		list.removeLast(); // remove last data 
		System.out.println(list);
		
	System.out.println(list.isEmpty()); // show to me list is empty
		
		list.clear(); // delete all data from linkedList
		System.out.println(list);
		
		if(list.isEmpty()){
			System.out.println("your content no things");
		}else{
			System.out.println("this is your content"+list);
		}
	}

}
