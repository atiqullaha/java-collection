package assingnment_of_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashSet<Customer>list=new LinkedHashSet<Customer>();
		list.add(new Customer(1, "hamraz", 4835434));
		list.add(new Customer(2, "latif", 93423));
		list.add(new Customer(3, "faiz", 23234));
		
		for(Customer obj:list){
//			System.out.println("name : "+ obj.Sustom_name);
	//System.out.println("id : "+obj.Custom_id +"  custom_number: "+obj.Custom_number);

		if(obj.Custom_id==3){
			obj.Sustom_name="hijran";
			
			}
		System.out.println("id :"+ obj.Custom_id+"name :"+obj.Sustom_name);
		}

	}

}
