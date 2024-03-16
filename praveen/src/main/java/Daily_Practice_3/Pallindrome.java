package Daily_Practice_3;

public class Pallindrome {

	public static void main(String[] args)
	{
		int n = 1221;
		int temp = n, rev = 0, rem = 0;;
		
		while(temp!=0)
		{
			rem=temp%10;
			System.out.println(rem);
			
			rev=rev*10+rem;
			temp=temp/10;
			System.out.println(temp);
		}
		
		if(n==rev)
		{
			System.out.println("Number is pallindrome");
		}
		else {
			
			System.out.println("Not an pallindrome.");
		}
	}
}
