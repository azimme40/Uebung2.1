package h3;

public class H3_main {
	public static void main(String[] args) 
	{
		int i = 2;
		int j = 3;
		int k = -10;
		
		
		if (i>j && i<199 && j<99)
		{
			k = 1;
		}
		
		if (i>200 && i>j && j<99)
		{
			k = 2;
		}
		if (j>100 && i>100 && i>j)
		{
			k = 3;
		}
		if (j<99 && i<199 && i<j)
		{
			k = 4; 
		}
	
		System.out.println (k);
		
	}
}
