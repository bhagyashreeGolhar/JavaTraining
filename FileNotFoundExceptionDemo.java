import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
// FileNotFoundException usind Throws keyword
/*public class FileNotFoundExceptionDemo {
	public static void main(String[] args) throws FileNotFoundException {
		m1();
	}
		public static  void m1() throws FileNotFoundException
		{
			 m2();
			System.out.println("This is M1 method");
		}
		public static void m2() throws FileNotFoundException
		{
			m3();
			System.out.println("This is M2 method");
		}
		public static void m3() throws FileNotFoundException
		{
			File f=new File("xyz.txt");
			FileReader fr=new FileReader(f);
		}
	

}*/





//FileNotFoundException using Try catch
public class FileNotFoundExceptionDemo {
	public static void main(String[] args) {
		m1();
	}
		public static  void m1() 
		{
			 m2();
			System.out.println("This is M1 method");
		}
		public static void m2() 
		{
			m3();
			System.out.println("This is M2 method");
		}
		public static void m3() 
		{
			try
			{
			File f=new File("xyz.txt");
			FileReader fr=new FileReader(f);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File Not Found Exception check file is present or not");
			}
			finally
			{
				System.out.println("Thank You!");
			}
		}
	

}

