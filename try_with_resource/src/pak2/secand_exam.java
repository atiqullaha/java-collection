package pak2;

import java.util.Scanner;

public class secand_exam {

	public static  int div(int x, int y){
		try{
		return x/y;
	}catch(ArithmeticException e){
		System.out.println("the division is worng by " +y);
		return x;
	}
		finally{
			System.out.println("this is finally bolck");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter value for x");
		int x=input.nextInt();
		System.out.println("enter value for y");
		int y=input.nextInt();
		
		System.out.println(div(x,y));

	}

}
