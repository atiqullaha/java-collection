package generic;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	ArrayList<Integer> data=new ArrayList<Integer>();//this is generic data
		data.add(200);
		data.add(4000);
//		data.add("atiq"); this is not print 
		System.out.println(data);
		
		ArrayList<String>list=new ArrayList<String>();//this is generic data
		list.add("atiq");
		list.add("hamraz"); 
		System.out.println(list);
		
		ArrayList<Customer>customer =new ArrayList<Customer>();
		customer.add(new Customer(1, "jan","kandahar"));//this is the address of value
		customer.add(new Customer(2, "javeed","kubal"));
		customer.add(new Customer(3, "jamal","Helmand"));
		System.out.println(customer);
		
		// Reading data from ArrayList 
		for(Customer obj:customer ){
			System.out.println("custmer id:"+ obj.custm_id);
			System.out.println("customer name :"+obj.custm_name);
			System.out.println("customer address :" +obj.custm_add);
			
		}
		// Specific data location 
		Customer obj1=customer.get(2);
		System.out.println("the specific name:"+obj1.custm_name);
	}

}
