package Daily_Practice_3;

public class Binary_Search {

	public static void main(String[] args)
	{
		double [] a = {11,3,4, 5, 9,1};
		
		int srch= 19;
		int li =0;
		int hi = a.length-1;
		int mi = (li+hi)/2;
		
     while(li<=hi)
	{
		if(a[mi]==srch)
		{
			System.out.println("Element Present At "+ mi + " idex position.");
			break;
		}
		else if(a[mi]<srch)
		{
			li=mi+1;
		}
		else 
		{
			hi=mi-1;
		}
		mi = (li+hi)/2;
	}
   
     if(li>hi)
     {
    	 System.out.print("Element not found.");
     }
	}
}
