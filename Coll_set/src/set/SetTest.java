package set;

import java.util.HashSet;
import java.util.LinkedHashSet;



public class SetTest {

	public static void main(String[] args) {
		
		HashSet<String >set=new HashSet<String>();
		set.add("ali");
		set.add("javeed");
		set.add("ali");
		set.add("hamraz");
		set.add("khan");
		System.out.print("this is HasSet :");
		System.out.println(set.toString());
		
		LinkedHashSet<String >set2=new LinkedHashSet<String>();
		System.out.print("this is linkedhas set :");
		set2.add("ali");
		set2.add("javeed");
		set2.add("ali");
		set2.add("hamraz");
		set2.add("khan");
		set2.add("javeed");
		System.out.println(set2.toString());
	}

}
