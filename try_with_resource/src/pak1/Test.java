package pak1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;

public class Test {

	public static void main(String[] args)  {
		
//		scanner is resource ,and don't need to catch exception heading 

	try(Scanner scan=new Scanner(System.in)){
		
		System.out.println("enter value : ");
		int x=scan.nextInt();
		System.out.println("your value is :"+x);
		
	}
	
	String path="C:\\Users\\Asia Computer\\Desktop\\hamraz.txt";
	try(BufferedReader br=new BufferedReader(new FileReader(path))){
				String d=br.readLine();
				System.out.println(d);
				} catch (IOException e) {
					
				
				}
				
			}

}
