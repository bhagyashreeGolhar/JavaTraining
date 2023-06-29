import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number");
			int num=sc.nextInt();
			System.err.println("Enter divider");
			int divider=sc.nextInt();
			int ans=num/divider;
			System.out.println("Ans is:"+ans);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Can not be divide by 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter valid number");
		}
	}

}
