package DATASTRUCT;

public class Queue<Type> {
	SinglyLinkedList<Type> list = new SinglyLinkedList<Type>();

	public void enqueue(Type data) {
		list.insert(data);

	}

	public void dequeue() {
		list.removeAtIndex(0);

	}

	public boolean isQueueEmpty() {
		if (list.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printQueue() {

		list.printList();
	}
	public int size() {
		return list.size();
	}

}
