package DATASTRUCT;
public class Main {
	public static void main (String[] args) {
		System.out.println("---------Singly Linked List-------------------");
		SinglyLinkedList<String> list= new SinglyLinkedList<String>();
		list.insert("0");

		list.insert("1");
		list.insert("2");
		list.insert("3");
		list.insert("4");

		list.removeAtIndex(4);
		list.printList();
		System.out.println("---------Stack--------------------------------");
		Stack<String> stack = new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		System.out.println("First Element : "+stack.getFirstItem());

		stack.printStack();
		System.out.println("Is Stack Empty? "+stack.isStackEmpty());

		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Is Stack Empty? "+stack.isStackEmpty());
		stack.printStack();


		System.out.println("---------Queue--------------------------------");

	
	}
}