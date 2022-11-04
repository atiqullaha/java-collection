package pak1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.ietf.jgss.Oid;

public class exam {

	public static void main(String[] args)throws IOException {
		
		String path="C:\\Users\\Asia Computer\\Desktop";
		
		try(Scanner scan=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new FileReader(path))){
			System.out.println("enter your value :");
			int x=scan.nextInt();
			System.out.println("your x value is:"+x);
			
			String data=br.readLine();
			
			System.out.println(data);
			
		}
	}

}
