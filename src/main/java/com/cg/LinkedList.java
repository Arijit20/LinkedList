package com.cg;

public class LinkedList<K> {
	INode<K> head;
	INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}

	public void print() {
		System.out.println("Printing LinkedList");
		StringBuffer myNodes = new StringBuffer();
		INode<K> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
