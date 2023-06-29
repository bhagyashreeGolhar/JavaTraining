
public class CoutnCharacterinString {
	public static void main(String args[])
	{
		String str="Bhagyashree12345Golharf";
		int count = 0;
		int index = 0;
				for(int i=0;i<str.length();i++ )
				{
					if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||
							str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||
							str.charAt(i)=='9'||str.charAt(i)=='0')
					{
						
						
					}
					else
					{
						count++;
					}
				}
				System.out.println("Count is "+count);
				
				//***************************Duplicate Characters**********************
				
				char arr[] = null;
				for(int i=0;i<str.length();i++ )
				{
					int charcount=0;
					if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||
							str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||
							str.charAt(i)=='9'||str.charAt(i)=='0')
					{
						
						
					}
					else
					{
						
						for(int j=i+1;j<str.length();j++)
						{
							
							if(str.charAt(j)==str.charAt(i))
							{
								charcount++;
								index=j;
								System.out.println("Duplicate character: "+str.charAt(i));
								
							}	
							
							//System.out.println("Duplicate character: "+str.charAt(index)+":"+charcount);
						}	
					}
					
				}
				
				
				
	}
}
