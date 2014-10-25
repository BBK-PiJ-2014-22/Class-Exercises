import java.util.Scanner;
public class e3_8_palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String word = System.console().readLine();
String reverse = "";

for (int l = word.length()-1 ; l == 0 ; l--){
	reverse += word.charAt(l);
}

System.out.println(reverse)


if (word.equals(reverse)){
	System.out.println("Palindrome!");
}else{
	System.out.println("Not a Palindrom!");
}

}}

