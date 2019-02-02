package DATASTRUCT;

public class Stack<Type> {
	int top=-1;
	SinglyLinkedList <Type> list = new SinglyLinkedList<Type>();
	
	public void push(Type data) {
		list.insert(data);
		top++;
	}
	public void pop() {
		list.removeAtIndex(top);
		top--;
	}
	public Type getFirstItem() {
		return list.head.data;
	}
	public boolean isStackEmpty() {
		if(list.head==null) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		return list.size();
	}
	public void printStack() {
		
		list.printList();
	}
}
