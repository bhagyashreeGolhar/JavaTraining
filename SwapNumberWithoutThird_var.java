
public class SwapNumberWithoutThird_var {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Value of a before swap is :"+a);
		System.out.println("Value of b before swap is :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swap is :"+a);
		System.out.println("Value of b after swap is :"+b);
	}

}
