package pak1;

interface Test{
	
	void   show(int x);
	int  add(int x,int y);
	int  mul(int x,int y);
	int  sub(int x,int y);
	int  div(int x,int y);
}
class braek implements Test{

	@Override
	public void  show(int x) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}




	
	
}
public class Adept extends braek {

	public static void main(String[] args) {

		Adept obj=new Adept();
		
//		System.out.println(1);
		
		System.out.println("the add function value is :"+obj.add(120, 20));
		
	System.out.println(obj.mul(20, 10));
	}

}
