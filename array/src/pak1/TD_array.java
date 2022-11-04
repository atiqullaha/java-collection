package pak1;
import java.util.Scanner;
public class TD_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[][]=new int[3][4];
Scanner scanner =new Scanner(System.in);
		
//		arr[1][3]=30;
//		arr[0][2]=300;
//		arr[0][1]=40;
//		arr[1][3]=50;
//		arr[0][3]=400;
//		
//		System.out.println(arr[0][1]);
//
//	

for (int row=0;row<3;row++){
	
	for(int col=0;col<4;col++){
		System.out.println("enter number for row and col "+row +  ","+col);
		arr[row][col]=scanner.nextInt();
		
	}
}

for (int row=0;row<3;row++){
	
	for(int col =0;col<4;col++){
		System.out.println("location "+row+","+col+"="+arr[row][col]);
	}
}

}

}
