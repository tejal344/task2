package calculator;

public class calculator {
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int subt(int a,int b)
	{
		return a-b;
	}
	public int division(int a,int b)
	{
		int ans=0;
		try {
			ans=a/b;
		}
		catch(ArithmeticException e)
		{
			
		}
		return ans;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int mod(int a,int b)
	{
		return a%b;
	}
}
