package pak2;

import java.util.Scanner;

public class nested_try {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name = "atiqullah hamraz";
		int number;
		int index;
		System.out.println("enter number when 10/0 ");
		number = input.nextInt();

		try {
			System.out.println(10 / number);
			System.out.println("provid to index value when you access charter ");
			index = input.nextInt();
			
			try{
			System.out.println(name.charAt(index));
			}catch(StringIndexOutOfBoundsException i){
				System.out.println("worng index of heandle ");
			}

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("end of the program");

	}

}
