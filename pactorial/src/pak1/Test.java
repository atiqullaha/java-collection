package pak1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number :");
		int num=scanner.nextInt();
		int fac=1;
		
		for(int i=1;i<=num;i++){
			fac=fac*i;
		}
		
		System.out.println("factorial of " +num + " is = "+fac);
	}

}
