package pak1;

import java.util.Scanner;

class incap{
	
	private String  name;
	private int Acount ;
	
	void nameset(String name){
		this.name=name;
	}
	void Acountset(int Acount){
		this.Acount=Acount;
	}
	String  getname(){
		return name;
	}
	int getAcount(){
		return Acount;
	}
}
public class exam {

	public static void main(String[] args) {
		
		incap obj=new incap();
		Scanner s = new Scanner(System.in);
		
		 System.out.println("enter your account number  : ");
		 int ob=s.nextInt();
		obj.Acountset(ob);
		
		System.out.println("enter your name ");
		String na=s.next();
	    obj.nameset(na);
		
		System.out.println("your name is "+obj.getname());
		System.out.println("your account is : "+obj.getAcount());
//		
		
		
		
	}



}
