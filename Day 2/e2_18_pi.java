import java.util.Scanner;
public class e2_18_pi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double pi = 0.0;
int number = 0;
double divider = 1.0;
double change = 0.0;
boolean add = true;
System.out.println("enter N for pi calculation");

number = Integer.parseInt(System.console().readLine());


for (int i = 0; i < number; i++){
	
	change = 4.0 / divider;
	
	if (add){
		pi = pi + change;
	}else {
		pi = pi - change;
	}
	
	divider += 2;
	
	
	System.out.println();//debug
	System.out.println("Change: "+change);//debug
	System.out.println("Number:" + number);//debug
	System.out.println("Pi :"+pi);//debug
	System.out.println("Divider :"+ divider);//debug
	System.out.println();//debug
}

System.out.println(number);
System.out.println(pi);
}}

