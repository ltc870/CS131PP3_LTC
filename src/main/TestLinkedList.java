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
		GenericNode<Integer> anIntNode = new GenericNode<Integer>();
		anIntNode.setData(30);
		myIntList.addNode(anIntNode);
		anIntNode = new GenericNode<Integer>();
		anIntNode.setData(40);
		myIntList.addNode(anIntNode);

		GenericNode<Integer> tempIntNode = myIntList.getList();
		do {
			System.out.println(tempIntNode.getData());
			tempIntNode = tempIntNode.getNextNode();
		} while (tempIntNode != null);

		GenericLinkedList<Double> myDoubleList = new GenericLinkedList<Double>();
		GenericNode<Double> aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(30.25);
		myDoubleList.addNode(aDoubleNode);
		aDoubleNode = new GenericNode<Double>();
		aDoubleNode.setData(50.50);
		myDoubleList.addNode(aDoubleNode);

		GenericNode<Double> tempDoubleNode = myDoubleList.getList();
		do {
			System.out.println(tempDoubleNode.getData());
			tempDoubleNode = tempDoubleNode.getNextNode();
		} while (tempDoubleNode != null);
	}// end main

}// end class
