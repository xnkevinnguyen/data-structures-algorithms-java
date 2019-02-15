package SORT;

import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[10];
		//creating a merge sort instance
		 MergeSort <int[]> sort=new MergeSort<int[]>();
		 mergeSort(array);

	}
	public static <T> void mergeSort(T[] array) {
		T[] tmpArray = (T[]) new Array[array.length];
		//mergeSort(array, tmpArray, 0, array.length - 1);

	}

}
