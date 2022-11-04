package pak1;
import java.util.Scanner;
public class method {
	
//	method with not return type and no passing argument
	/*
	void addmethod(){
		int a =20;
		int b=200;
		int c=a+b;
		
		System.out.println("a and b is :"+c);
	}
	
	void abstrac(){
		int x=30;
		int y=20;
		int z= x-y;
		System.out.println(" abstruct is :"+z);
	}
	*/
	public static void main(String args[]){
		
		method obj=new method();
		
//		obj.addmethod();
//		obj.abstrac();
		
//		obj.show(20, 40);
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("enter salary");
		int salary=s.nextInt();
		System.out.println("enter your bonus ");
		int bonus=s.nextInt();
		
		obj.show_empl(name, salary, bonus);
		
	}
	
//	method no return type but passing argument 
	/*
	void show(int x,int y){
		int a;
		int b;
		int c;
		a=x;
		b=y;
		c=x+y;
		System.out.println("the result of the a and b is :"+c);
	}
	*/
	
	
void show_empl(String name,int salary,int bonus){
	
int total=salary+bonus;
	System.out.println("name is " +name+", "+" salary is :" +salary + " bonus is :"+ total);
}



}
