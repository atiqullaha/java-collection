package pak1;


import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(new Student1(1,"atiq"));
		list.add(new emp(29,"hamraz"));
		list.add(new Student1(19,"barat"));
		
		Student1 stu=(Student1)list.get(0);
		System.out.println(stu.id+","+stu.name);
//		System.out.println(stu.id+","+stu.name);
		
//		emp emp1=(emp)list.get(1);
//		System.out.println(emp1.id+","+emp1.name);
		
		Object obj=(Object)list.get(0);
		if(obj instanceof Student1){
			Student1 stu1=(Student1)obj;
			System.out.println(stu1.id+"$"+stu1.name);
		}else if(obj instanceof emp){
			emp emp2=(emp)obj;
			System.out.println(emp2.id+"$"+emp2.name);
		}
	}

}
