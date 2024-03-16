package Daily_Practice_3;

public class Quick_Sort {
	
	long parition(int[] arr, int low, int high)
	{
		int pivot=arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
			return low;
		}
		return pivot;
		
	}

	public static void main(String[] args, int pivot)
	{
		int[] original_array= {15,9,13,12,4,16,118,11};
//		int pivot = original_array[original_array.length/2];
		
		for(int i=0; i<pivot; i++)
		{
			
		}
	}

}
