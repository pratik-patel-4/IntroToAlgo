package sortingAlgo.InsertionSort;

public class Solution {

	public static void main(String[] args) {
		
		int[] a = {5,3,4,1,2};
		a = insertionSort(a, a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	private static int[] insertionSort(int[] a, int len) {
		for(int i = 1; i < len ; i++) {
			int key = a[i];
			int j = i - 1;
			/*while(j >= 0 && a[j]>key) {
				a[j+1] = a[j];
				j = j - 1;
			}*/
			for(j = i - 1; j >= 0 && a[j] > key; j--) {
				a[j+1] = a[j];
			}
			a[j+1] = key;
		}
		return a;
	}

}
