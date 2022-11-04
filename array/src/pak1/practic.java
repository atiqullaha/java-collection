package pak1;
import java.util.Scanner;
public class practic {
	
	// some practice for methods
	boolean booking (int age){
		boolean allow;
		if (age>18){
			allow=true;
		}
		else{
			allow=false;
		}
		return allow;
	}

	public static void main(String[] args) {
		 
		practic obj=new practic();
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your age ");
		int age=scanner.nextInt();
		
	if(obj.booking(age)){
		System.out.println("you can eligiable to booking ");
	}
	else {
		System.out.println("you can not eligiable to booking ");
	}

		
		
		
	}

}
