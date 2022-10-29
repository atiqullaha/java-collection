package pak1;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		
	
//		System.out.println(System.getProperty("java.runtime.version")) ;
		
		ArrayList mylist=new ArrayList();
		
		mylist.add("ahmad");
		mylist.add(399);
		mylist.add("z");
		mylist.add("wellcome");
		
		Student1 stu=new Student1(30,"ali");
		
		mylist.add(new emp(22,"khan"));
		mylist.add(stu);
		
		System.out.println(mylist);

		for(Object obj:mylist){
			
		if(obj instanceof emp){
			
			emp emp1=(emp)obj;
			
			System.out.println("employee id is :"+emp1.id);
			System.out.println("employee name is :"+emp1.name);
		}

		else if(obj instanceof Student1){
			Student1 stud=(Student1)obj;
			
			System.out.println("the student id is : " +stud.id);
			System.out.println("the student name is : " +stud.name);
			
		}
		else if(obj instanceof Integer){
			System.out.println(obj);
		}
		else if(obj instanceof String ){
			System.out.println(obj);
		}else if (obj instanceof Character){
			System.out.println(obj);
		}
		}
	}

}
