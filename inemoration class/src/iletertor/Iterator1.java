package iletertor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterator1 {

	public static void main(String[] args) {

		ArrayList<Student> stud = new ArrayList<Student>();
		stud.add(new Student(1, "khan", 399));
		stud.add(new Student(2, "ali", 200));
		stud.add(new Student(3, "jan", 400));
		stud.add(new Student(3, "janmama", 4000));

		
		Iterator<Student> reader = stud.iterator();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the student id ");
		int search_id=scan.nextInt();
		
	while (reader.hasNext()) {
			
	Student obj = reader.next();
	if(obj.id==search_id){
//	System.out.println("id :" + obj.id + " name :" + obj.name + " " + " fees :" + obj.fees);
		
	reader.remove();
	System.out.println("remove id:"+search_id+"  from this list");
	
		}
	System.out.println("id :" + obj.id + " name :" + obj.name + " " + " fees :" + obj.fees);

	}
	System.out.println("after removing");
	Iterator<Student>reading=stud.iterator();
	while(reading.hasNext()){
		Student obj=reading.next();
		System.out.println("id :" + obj.id + " name :" + obj.name + " " + " fees :" + obj.fees);

	}

}}
