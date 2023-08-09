package linkedlist;

/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * 
 * @author rkelley/njohnson/lcaudle
 *         Programming Project 1 Start Project
 *         CS131ON
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head; // node to represent the head of the list
	private GenericNode<T> tail; // node to represent the tail (end) of the list
	private int length; // variable to keep track of the number of elements in the list

	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList() {
		head = null;
		length = 0;
		tail = head;
	}// end empty-argument constructor

	/**
	 * The constructor for this object initializes the list such that
	 * you can set a head, tail, and length of the list.
	 */
	public GenericLinkedList(GenericNode<T> head, GenericNode<T> tail, int length) {
		this.head = head;
		this.tail = tail;
		this.length = length;
	}

	/**
	 * Method to see if there are any elements in the list.
	 * 
	 * @return boolean true/false
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}// end isEmpty

	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * 
	 * @return
	 */
	public GenericNode<T> getList() {
		return head;
	}// end getList

	/**
	 * This method returns the length of the list
	 * 
	 * @return int
	 */
	public int getLength() {
		return length;
	}

	/**
	 * This method sets the length of the list
	 * 
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * 
	 * @param aNode
	 */
	public void addNode(GenericNode<T> aNode) {
		if (isEmpty()) {
			head = aNode;
			tail = head;
			return;
		}

		tail.setNextNode(aNode);
		tail = tail.getNextNode();
		tail.setNextNode(null);
		length++;

	}// end addNode

}// end class
