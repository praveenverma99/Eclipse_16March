package Daily_Practice;


public class Star_Pattern {

	public static void main(String[] args)
	{
		for(int a = 0; a<4; a++)	
		{
			for(int b = 0; b<=a; b++)
			{
				System.out.print("%");
			}
			System.out.println();
		}

		for(int c=0; c<5; c++)
		{
			System.out.print("-");
		}

		System.out.println();
	
		for(int i = 4; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
