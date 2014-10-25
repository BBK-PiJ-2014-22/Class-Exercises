import java.util.Scanner;
public class e2_18_pi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double pi = 0.0;
int number = 0;
double divider = 1.0;

System.out.println("enter N for pi calculation");

number = Integer.parseInt(System.console().readLine());

System.out.println(number);

String stop = System.console().readLine();


for (int i = 0; i >= number; i++){
	pi += 4.0 / divider; 
	System.out.println(number);
}

System.out.println(number);
System.out.println(pi)
}}

