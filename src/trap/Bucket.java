package trap;

import java.util.Random;

public class Bucket 
{

	public static int trapVar() 
	{
		int tempVariable = new Random().nextInt(10)+1;
		System.out.println("Trap is present in "+ tempVariable);
		return tempVariable;
	}
}
