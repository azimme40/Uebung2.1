package h3;

public class H3_main {
	public static void main(String[] args) 
	{
		int i = 2;
		int j = 3;
		int k = -10;
		
		
		if (i>j && i<201 && j<101)
		{
			k = 1;
		}
		
		if (i>200 && i>j && j<101)
		{
			k = 2;
		}
		if (j>100 && i>200 && i>j)
		{
			k = 3;
		}
		if (j<101 && i<201 && i<j)
		{
			k = 4; 
		}
	
		System.out.println (k);
		
	}
}
//tetstststst