package pak1;
import java.util.Scanner;
public class calculat {

	double text1;
	double text2;
	double  text3;
	double optinalmark;
	double everge;
	double parsent;
	
	char calculitmarke(double t1,double t2,double t3 ){
		text1=t1;
		text2=t2;
		text3=t3;
		
		optinalmark=text1+text2+text3;
	
		everge=optinalmark/3;
		parsent=100*optinalmark/300;
		char grade;
		if(everge>90){
			grade='A';
		}
		else if(everge>70){
			grade='B';
		}
		else{
			grade='C';
		}
		return grade;
	}
	public static void main(String[] args) {
		
		calculat obj=new calculat();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter your marks ");
		
		int t1=scanner.nextInt();
		System.out.println("enter your marks ");
		int t2=scanner.nextInt();
		System.out.println("enter your marks ");
		
		int t3=scanner.nextInt();
		
		char g=obj.calculitmarke(t1, t2, t3);
		
		System.out.println("your garde is : "+g);
		
		System.out.println(obj.optinalmark);
		System.out.println("your everge is "+obj.everge);
		
		System.out.println("your parsent is :"+obj.parsent);
		
	}

}
