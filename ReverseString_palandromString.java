import java.util.Scanner;

public class ReverseString_palandromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Reverse String is:"+rev);
		if(str.equals(rev))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		
		
		
	}

}
