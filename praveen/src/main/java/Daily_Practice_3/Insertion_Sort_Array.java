package Daily_Practice_3;

import java.util.Arrays;

public class Insertion_Sort_Array {

	public static void main(String[] args) {
		int[] a = {5, 3, 1, 4, 2};
		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		System.out.print(Arrays.toString(a));
	}
}
