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
		add = false;
	}else {
		pi = pi - change;
		add = true;
	}
	
	divider += 2;

}

System.out.println("With an n of " + number + " Pi is calculated as:");
System.out.println(pi);
}}

