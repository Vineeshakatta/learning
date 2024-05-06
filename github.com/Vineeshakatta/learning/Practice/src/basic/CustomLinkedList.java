package basic;

public class CustomLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public CustomLinkedList() {
		this.size =0;
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = node;
		node = head;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	
	public void insertLast(int value) {
		if(tail==null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int value, int index) {
		if(index==0) {
			insertFirst(value);
			return;
		}else if(index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
		
	}
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
	}
	
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast = get(size-2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		} else if(index==size-1) {
			return deleteLast();
		}
		Node prev = get(index-1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return val;
	}
	
	public Node find(int value) {
		Node find = head;
		while(find!=null) {
			if(find.value==value) {
				return find;
			}
			find = find.next;
		}
		return null;
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i=1;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
