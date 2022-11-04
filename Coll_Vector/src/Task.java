import java.util.ListIterator;
import java.util.Vector;

public class Task {

	public static void main(String[] args) {


		Vector<Integer> mvector=new Vector<Integer>();
		
		for(int x=1;x<=30;x++){
			mvector.add(x);
				
		}
		System.out.println(mvector.toString());
		
		ListIterator <Integer>mlist=mvector.listIterator();
		while(mlist.hasNext()){
			int inte=mlist.next();
			
			if(inte%2==1){
			mlist.remove();	
			}
		}
		System.out.println("this is even numbers"+mvector);
	}

}
