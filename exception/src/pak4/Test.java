package pak4;

class TestA{
	public void method3(){
		System.out.println(10/0);
	}
	public void method2(){
		 method3();
		
	}
	public void method1(){
		 method2();
	}
}
public class Test {

	public static void main(String[] args) {
		
		TestA obj=new TestA();
		
		try{
			obj.method1();	
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	
		
		System.out.println("the program is restt ");
		
		

	}

}
