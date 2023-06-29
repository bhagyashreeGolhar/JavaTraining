
public class arrayIndexOutofBoundException {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try
		{
		System.out.println(arr[5]);   //it will though array index out of bound exception
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception ocuured:-"+a);
		}
	}

}
