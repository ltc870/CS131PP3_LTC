package main;

import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		GenericLinkedList<String> myStringList = new GenericLinkedList<String>();

		GenericNode<String> aStringNode = new GenericNode<String>();
		aStringNode.setData("String");
		myStringList.addNode(aStringNode);
		aStringNode = new GenericNode<String>();
		aStringNode.setData("Love");
		myStringList.addNode(aStringNode);

		GenericNode<String> tempStringNode = myStringList.getList();
		do {
			System.out.println(tempStringNode.getData());
			tempStringNode = tempStringNode.getNextNode();
		} while (tempStringNode != null);

		GenericLinkedList<Integer> myIntList = new GenericLinkedList<Integer>();
		GenericNode<Integer> aIntNode = new GenericNode<Integer>();
		aIntNode.setData(30);
		myIntList.addNode(aIntNode);
		aIntNode = new GenericNode<Integer>();
		aIntNode.setData(40);
		myIntList.addNode(aIntNode);

		GenericNode<Integer> tempIntNode = myIntList.getList();
		do {
			System.out.println(tempIntNode.getData());
			tempIntNode = tempIntNode.getNextNode();
		} while (tempIntNode != null);

	}// end main

}// end class
