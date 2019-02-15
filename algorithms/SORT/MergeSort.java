package SORT;

import java.lang.reflect.Array;

//Merge sort on an array of <Type>
@SuppressWarnings("unchecked")

public class MergeSort <Type>{

	public static <Type> void mergeSort(Type[] array) {
		Type[] tmpArray = (Type[]) new Array[array.length];
		mergeSort(array, tmpArray, 0, array.length - 1);

	}

	private static <Type> void mergeSort(Type[] array, Type[] tmpArray, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			// recursive until every elements of the arrays are separated
			mergeSort(array, tmpArray, left, center);
			mergeSort(array, tmpArray, center + 1, right);
			merge(array, tmpArray, left, center + 1, right);
		}
	}

	private static <Type> void merge(Type[] array, Type[] tmpArray, int leftPos, int rightPos, int rightEnd) {
		int leftEnd = rightPos - 1;
		/*leftPos   leftEnd rightPos    RightEnd */

		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;
		while (leftPos <= leftEnd && rightPos <= rightEnd)
			if ((int)array[leftPos]<((int)array[rightPos]) )
				tmpArray[tmpPos++] = array[leftPos++];
			else
				tmpArray[tmpPos++] = array[rightPos++];
		while (leftPos <= leftEnd) {
			tmpArray[tmpPos++] = array[leftPos++];
		}
		while (rightPos <= rightEnd) {
			tmpArray[tmpPos++] = array[rightPos++];
		}
		for (int i = 0; i < numElements; i++, rightEnd--) {
			array[rightEnd] = tmpArray[rightEnd];
			System.out.print(tmpArray[rightEnd]);
		}
	}

}
