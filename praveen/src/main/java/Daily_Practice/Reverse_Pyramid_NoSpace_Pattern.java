package Daily_Practice;

public class Reverse_Pyramid_NoSpace_Pattern {

	public static void main(String[] args)
	{
		for(int i = 0; i<4; i++)
		{	
			
			for(int k = 0; k<i; k++)
			{
				System.out.print(" ");
			}		
		
			
			for(int j = 0 ; j==i; j++)
			{
				System.out.println();
			}			
		}
	}
}
