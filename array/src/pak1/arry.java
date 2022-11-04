package pak1;

import java.util.Scanner;
public class arry {
	
public static void main(String args[]){
	 

	/*
	int []arr =new int [5];
	
	arr[0]=20;
	arr[1]=30;
	arr[3]=39;
	
	System.out.println(arr[2]);
	*/
//  OR WE CAN USE THIS WAY FOR ARRAY
	
	/*
	double [] arry={2.34,3.44,5,9,1};
	
	System.out.println( "location of arry 4 is : "+ arry[3]);
	System.out.println( "location of arry 5 is : "+ arry[2]);
	*/
	

//		and we can use loop for array like this 
	
	Scanner scanner=new Scanner(System.in);

	
	int [] arr=new int[8];
	for (int i=0;i<6;i++){
		System.out.println("enter an number for location " +i);
		arr[i]=scanner.nextInt();
	}
	System.out.println("location of 3 : "+arr[3]);
	
	
	for(int i=0;i<6;i++){
		System.out.println("postion of  " + i + ": contin : " +arr[i]);
	}
}

}
