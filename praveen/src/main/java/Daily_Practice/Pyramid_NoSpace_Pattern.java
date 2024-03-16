package Daily_Practice;

public class Pyramid_NoSpace_Pattern {

	public static void main(String[] args)
	{
		for(int i =0; i<3 ; i++)
		{
			for(int j = 2; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();

		}

	}

}