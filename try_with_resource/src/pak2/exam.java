package pak2;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter number so 10 divid on ");
		int x=input.nextInt();
		
		try{
			System.out.println(10/x);
			
		}catch(ArithmeticException e){
			System.out.println("divion is wrong  ");
			
			System.out.println("enter number so 10 divid on ");
		    x=input.nextInt();
			
		    try{
			System.out.println(10/x); 
		
		}catch(ArithmeticException a){
			System.out.println("division is wrong ");
			System.out.println("sorry the value is not divid ");
		}
		
		}
		finally{
			System.out.println("end of the program ");
		}
	}

}
