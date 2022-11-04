import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
//		Default Constructor
//		user define constructor 
//		user define constructor with Inc+	
		
		ArrayList mlist=new ArrayList();
		mlist.add("mouse");
		mlist.add("moniter");
		mlist.add("ic");
		
//		adding anther collection class costructor
		
		
		Vector mvec=new Vector(mlist);
		mvec.add("computer");
		mvec.add("cpu");
		mvec.add("keyboard");
		mvec.add("screen");
		
		 
		
		
		Iterator<String> it=mvec.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
	}
   System.out.println(mvec.capacity());
		
	}

}
