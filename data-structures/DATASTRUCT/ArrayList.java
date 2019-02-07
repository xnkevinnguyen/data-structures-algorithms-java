package DATASTRUCT;

import java.util.Arrays;

public class ArrayList<Type> {
	private Type[] array;
	private int arrayMaximum;
	private int nbElements = 0;

	@SuppressWarnings("unchecked")
	public ArrayList() {
		array = (Type[]) new Object[10];
		arrayMaximum = 10;
	}

	public Type get(int index) throws Exception {
		if (index < nbElements) {
			return array[index];
		}else {
			arrayListExceptions(index);
		}
		return null;

	}

	public void add(Type element) {
		nbElements++;
		if (nbElements >= arrayMaximum) {
			increaseArraySize();
		}
		array[nbElements] = element;
	}

	public void remove(int index) throws Exception {
		if (index < nbElements) {
			for (int i = index; i < nbElements; i++) {
				array[i] = array[i + 1];
			}
		}else {
			arrayListExceptions(index);
		}
	}
	private void arrayListExceptions(int index) throws Exception  {
		if (index < arrayMaximum) {
			throw new Exception("Undefined element at this index");
		} else {

			throw new ArrayIndexOutOfBoundsException();
		}
	}

	private void increaseArraySize() {
		array = Arrays.copyOf(array, arrayMaximum * 2);
		arrayMaximum *= 2;
	}

}
