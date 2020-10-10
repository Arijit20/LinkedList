package com.cg;

public class Node<K> {
	private K key;
	private Node next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
