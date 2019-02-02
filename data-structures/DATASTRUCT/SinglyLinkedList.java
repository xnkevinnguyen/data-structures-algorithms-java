package DATASTRUCT;

public class SinglyLinkedList<Type> {
	Node<Type> head = null;

	public void insert(Type data) {
		Node<Type> newNode = new Node<Type>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<Type> lastNode = this.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
	}

	public void removeAtIndex(int index) {
		Node<Type> currentNode = this.head;
		Node<Type> previousNode = null;
		if (this.head.next != null) {

			for (int i = 0; i <= index; i++) {
				if (i == index) {
					System.out.println("Removed : " + currentNode.data + " at index : " + index);
					previousNode.next = currentNode.next;

				} else {
					previousNode = currentNode;
				}
				currentNode = currentNode.next;

			}
		}
		else {
			this.head=null;
			System.out.println("Emptied list");
		}

	}

	public void printList() {
		Node<Type> currentNode = this.head;
		while (currentNode != null) {
			System.out.println(currentNode.data + " -> ");
			currentNode = currentNode.next;

		}
	}
}

class Node<Type> {
	Type data;
	Node<Type> next;

	Node(Type initialData) {
		data = initialData;
	}
}