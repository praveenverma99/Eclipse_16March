package Daily_Practice_3;

public class Armstrong_Number {

	public static void main(String[] args)
	{
		int no = 153;
		int t1= no;
		int lang = 0;

		while(t1 != 0)
		{
			t1 = t1/10;
			lang = lang +1;
		}

		
		int t2 = no;

		int rem;
		int arm = 0;
		while(t2 !=0)
		{ 
			int mult = 1;
			rem = t2%10;
			for(int i =0; i<lang; i++)
			{
				mult *=rem;
		//		System.out.println(mult);
			}

			arm +=mult;	
			t2 = t2/10;
		}

		if(arm == no)
		{
			System.out.println("Number is an Armstrong number.");
		}
		else
		{
			System.out.println("Number is not an Armstrong number");
		}
	}

}
