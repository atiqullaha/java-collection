package pak1;
import java.util.Scanner;
public class method3 {
	
	
	int multi (int x, int y){
		 
	    int total=x*y;
		
		return total;
	}

	public static void main(String[] args) {
		// 3: method with return type but not passing argument
		
		method3 object =new method3();
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter first number");
		int firstnumber=s.nextInt();
		System.out.println("enter secand number  ");
		int secandnumber=s.nextInt();
		object.multi(firstnumber, secandnumber);
//		int total=firstnumber*secandnumber;
		int total=object.multi(firstnumber, secandnumber);
		System.out.println(firstnumber + " x "+secandnumber +" = "+total);

	}

	
}
