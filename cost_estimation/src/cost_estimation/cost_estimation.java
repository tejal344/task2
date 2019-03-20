package cost_estimation;

public class cost_estimation {
	public int cost(int a,String std)
	{
		int cos=0;
		if(std.equals("standard"))
		{
			cos=a*1200;
		}
		else if(std.equals("abovestandard"))
		{
			cos=a*1500;
		}
		else if(std.equals("highstandard"))
		{
			cos=a*1800;
		}
		else
		{
			cos=a*2500;
		}
		return cos;
		
	}
}
