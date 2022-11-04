package pak4;

public class exam {

	public static void main(String[] args) {
		
		
		try{
		int n[]=null;
		int l=n.length;
		System.out.println(l);
		System.out.println(10/0);
		}
		catch (ArithmeticException|NullPointerException e){
			System.out.println(e);
		}
		
		System.out.println("end of the program ");
		

	}

}
