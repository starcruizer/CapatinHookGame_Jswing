package trap;

public class Algorithm 
{
	
	public static int rule01(String str ,  int bks) 
	{
		
		int a = 0;		
		int breakVal = bks;
		int b = Integer.parseInt(str);
		System.out.println(b);
		
		if(b == breakVal) 
				a = 0;
		else if(b!= breakVal)
				a = 1;
		return a;
	}	
	
	public static int rule02(String str ,  int bks) 
	{
		int a = 0;
		int breakVal = bks;
		int b = Integer.parseInt(str);
		System.out.println(b);
		
		if(b == breakVal)
			a = 1;
		else
			a = 0;
		return a;
	}
		
}
