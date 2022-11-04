package pak1;
import java.util.Scanner;
public class method1 {
// method not return type but passing argument 
void table(int number){
	
	for(int i=1;i<=10;i++){
	System.out.println(i+"x"+number+ " ="+number*i);	
	}
}
	public static void main(String[] args) {
		
		method1 object=new method1();
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter a number for table ");
		int number=obj.nextInt();
		
		object.table(number);

	}

}
