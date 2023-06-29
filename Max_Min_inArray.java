
public class Max_Min_inArray {
	
	public static void main(String args[])
	{
		int arr[]= {10,3,8,24,56,99,76,12};
		int max=arr[0];
		int min=arr[0];
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max Number is :"+max);
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<=min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min Number is :"+min);
	}

}
