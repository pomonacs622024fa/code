package basic;

public class ReverseLinkedList<E> extends SinglyLinkedList<E>{

    public void reverseLinkedListIteratively() {
		Node previous = null;
		Node finger = head;
		Node next;
		while (finger != null) {
			next = finger.next;
			finger.next = previous;
			previous = finger;
			finger = next;
		}
		head = previous;
	}

	public Node reverseLinkedListRecursively(Node head) {
		Node first;
	
		if (head==null || head.next == null)
			return head;
	
		first = reverseLinkedListRecursively(head.next);
		//reverse link
		head.next.next = head;
		//break old pointer
		head.next = null;
	
		return first;
	}
	

    public static void main(String[] args) {
		ReverseLinkedList<Integer> sll = new ReverseLinkedList<Integer>();
		sll.add(3);
		sll.add(2);
		sll.add(1);
        System.out.println(sll);
		sll.head = sll.reverseLinkedListRecursively(sll.head);
        System.out.println(sll);
		sll.reverseLinkedListIteratively();
        System.out.println(sll);


	}


}