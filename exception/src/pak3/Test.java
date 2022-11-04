package pak3;

public class Test {

	void method3(){
		try{
		System.out.println(10/0);
		}
		catch (ArithmeticException e){
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	void method2(){
		method3();
	}
	void method1(){
		method2();
	}
	public static void main(String[] args) {
		
		
		
//		try{
//			System.out.println(10/0);
//		}
//		catch(ArithmeticException e){
//			System.out.println(e.getMessage() );
//		}
		
		
		Test obj=new Test();
		obj.method1();
		
		
		System.out.println("end of the program ");
	}

}
