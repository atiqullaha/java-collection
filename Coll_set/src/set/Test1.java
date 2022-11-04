package set;

import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		
	// default constructor it capacity 16 and load factor 0.75
		HashSet<String>list=new HashSet<String>();
		list.add("computer");
		list.add("cpu");
		list.add("manitor");
		list.add("Scanner");
		
	// 2nd constructor it capacity 5 and load factor 0.75
		HashSet<Integer>list1=new HashSet<Integer>(5);
		list1.add(3999);
		
	// 3rd constructor it capacity 20 and load factor 0.4
		
		HashSet<String>list2=new HashSet<String>(20,0.4f);
		list2.add("hamraz");
		list2.add("javeed");
		
	// HasSet constructor inside anther HasSet
		HashSet<String>list3=new HashSet<String>(list);
		list3.add("hamid");
		list3.add("Rahimullah");
		System.out.println(list3);
		
	}

}
