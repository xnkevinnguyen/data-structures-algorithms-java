package DATASTRUCT;

class LinkedList {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = this.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
	}
	public void printList() {
		Node currentNode = this.head;
		while(currentNode!= null) {
			System.out.println(currentNode.data+" -> ");
			currentNode=currentNode.next;
			
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int initialData) {
		data = initialData;
	}
}