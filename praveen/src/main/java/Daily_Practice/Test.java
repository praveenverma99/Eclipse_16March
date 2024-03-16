package Daily_Practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=1; k<=5; k++) 
		{
			for(int l=5; l>k; l--)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=k; k++)
			{
				if(k>=2 && m>1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");		
				}
			}
			System.out.println();
		}

	}

}
