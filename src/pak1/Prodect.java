package pak1;

import java.util.ArrayList;

public class Prodect {
	
	int pid;
	String pname;
	Prodect(int pid,String pname){
		this.pid=pid;
		this.pname=pname;
	}

	public static void main(String[] args) {
		
		ArrayList<Prodect> list=new ArrayList<Prodect>();
		list.add(new Prodect(0, "Computer"));
		list.add(new Prodect(1, "mouse"));
		list.add(new Prodect(2, "keyboard"));
		list.add(new Prodect(3, "screen"));
		

		System.out.println("size of prodect :"+list.size());
//		list.remove(1);
		System.out.println(list.size());
		list.set(1, new Prodect(5, "input"));
		for(Prodect obj:list){
			System.out.println(obj.pid+":"+obj.pname);
			
		}
		
		if(list.isEmpty()){
			System.out.println("the list is empty");
		}

//		list.clear();
	}
	
	

}
