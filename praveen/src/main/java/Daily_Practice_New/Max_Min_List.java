package Daily_Practice_New;

public class Max_Min_List {

	public static void main(String[] args)
	{
		int[]a = {3,1,5,9,2};

		int max = a[0];

		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

		for(int j=0; j<a.length; j++)
		{
			System.out.print(a[j]);
		}
	}
}
