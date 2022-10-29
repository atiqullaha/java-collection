package pak1;

import java.util.ArrayList;

public class Exam {

	public static void main(String[] args) {
		
		ArrayList<Prodect>mlist1=new ArrayList<Prodect>();
		mlist1.add(new Prodect(20, "Computer"));
		
		ArrayList<Customer>mlist2=new ArrayList<Customer>(20);
		mlist2.add(new Customer(2, "hamraz", "helmand"));
		
		ArrayList stock=new ArrayList(mlist2);
		stock.add("atiqullah");
		
		for(Object obj:stock){
		
			
			if(obj instanceof Prodect){
				Prodect p=(Prodect)obj;
				System.out.println("id  :"+p.pid);
				System.out.println("prodect  :"+p.pname);
			}else if(obj instanceof String ){
			System.out.println(obj);
			}else if((obj instanceof Customer)){
				Customer c=(Customer)obj;
				System.out.println("customer id :"+c.custm_id);
				System.out.println("cusmtomer name :"+c.custm_name);
				System.out.println("customer adderrss:"+c.custm_add);
			}
			
				
			}
		}
		
		
	}


