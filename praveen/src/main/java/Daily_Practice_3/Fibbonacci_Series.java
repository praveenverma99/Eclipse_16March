package Daily_Practice_3;

public class Fibbonacci_Series {

	public static void main(String[] args)
	{
		int a =0;
		int b = 1;

		int temp;

		for(int i=1; i<10; i++)
		{
			temp = a +b ;
			System.out.print(temp + " ");
			 a =b;
			 b=temp;
		}
	}
}


