package h2;

public class H2_main {
	public static void main(String[] args) 
	{
		int i = 4; 
		int j = 5; 
		int k = 9; 
		int min  = 10; 
		int max  = 11; 
		
	if(i < j && i < k) 
	
		{
		min = i;
		}
		
	if(j < i && j < k)
	
		{
		min = j;
		}
		
	if(k < j && k < i) 
	
		{
		min = k;
		}
	
	if(j > i && j > k)
	
	{
	max = j;
	}
	
	if(i > j && i > k)
	
	{
	max = i;
	}
	
	if(k > j && k > i)
	
	{
	max = k;
	}
System.out.println ("Minimum: " + min); 	
System.out.println ("Maximum: " + max);
	
	}


}
