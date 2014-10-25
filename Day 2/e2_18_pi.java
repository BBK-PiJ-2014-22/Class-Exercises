import java.util.Scanner;
public class e2_18_pi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double pi = 0.0;
int number = 0;
double divider = 1.0;
double add = 0.0;

System.out.println("enter N for pi calculation");

number = Integer.parseInt(System.console().readLine());

System.out.println("About to do a for loop...");//debug

for (int i = 0; i < number; i++){
	System.out.println("I'm doing a for loop!");//debug
	add = 4.0 / divider;
	System.out.println("Add: "+add);//debug
	pi = pi + add;
	System.out.println("Number:" + number);
	System.out.println("Pi :"+pi);//debug
}

System.out.println(number);
System.out.println(pi);
}}

