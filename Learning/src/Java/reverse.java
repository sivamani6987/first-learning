package Java;

class reverse 
{ 
	Node head; // head of list 
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

	void printReverse(Node head) 
	{ 
		if (head == null) return; 

		printReverse(head.next); 

		System.out.print(head.data+" "); 
	} 

	public void push(int new_data) 
	{ 
	
		Node new_node = new Node(new_data); 

		new_node.next = head; 

		head = new_node; 
	} 

	public static void main(String args[]) 
	{ 
		reverse llist = new reverse(); 
		llist.push(4); 
		llist.push(3); 
		llist.push(2); 
		llist.push(1); 

		llist.printReverse(llist.head); 
	} 
} 
