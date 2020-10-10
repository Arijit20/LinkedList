package com.cg;

import org.junit.Test;

import com.cg.Node;

import static org.junit.Assert.*;

import org.junit.Assert;

public class NodeTest {
    @Test
    public void given3NumbersShouldPass() {
    	Node<Integer> firstNode = new Node<>(56);
    	Node<Integer> secondNode = new Node<>(30);
    	Node<Integer> thirdNode = new Node<>(70);
    	firstNode.setNext(secondNode);
    	secondNode.setNext(thirdNode);
    	boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
    	Assert.assertTrue(result);
    }
    @Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(firstNode);
		linkedList.add(secondNode);
		linkedList.add(thirdNode);
		linkedList.print();
		boolean result = linkedList.head.equals(thirdNode) && linkedList.head.getNext().equals(secondNode)
				&& linkedList.tail.equals(firstNode);
		assertTrue(result);
	}
    @Test
 	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
 		Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(secondNode);
 		linkedList.append(thirdNode);
 		linkedList.print();
 		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
 				&& linkedList.tail.equals(thirdNode);
 		assertTrue(result);
 	}
    @Test
    public void given3NumbersTestingInsertFunction() {
    	Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(thirdNode);
 		linkedList.insert(firstNode, secondNode, thirdNode);
 		linkedList.print();
 		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
 				&& linkedList.tail.equals(thirdNode);
 		assertTrue(result);
    }
    @Test
    public void givenNumbersTestingDeleteFromHeadFunction() {
    	Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		Node<Integer> fourthNode = new Node<>(60);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(secondNode);
 		linkedList.append(thirdNode);
 		linkedList.append(fourthNode);
 		linkedList.pop();
 		linkedList.print();
 		boolean result = linkedList.head.equals(secondNode) && linkedList.head.getNext().equals(thirdNode)
 				&& linkedList.tail.equals(fourthNode);
 		assertTrue(result);
    }
    @Test
    public void givenNumbersTestingDeleteFromLastFunction() {
    	Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		Node<Integer> fourthNode = new Node<>(60);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(secondNode);
 		linkedList.append(thirdNode);
 		linkedList.append(fourthNode);
 		linkedList.popLast();
 		linkedList.print();
 		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
 				&& linkedList.tail.equals(thirdNode);
 		assertTrue(result);
    }
    @Test
    public void givenNumbersTestingSearchFunction() {
    	Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		Node<Integer> fourthNode = new Node<>(60);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(secondNode);
 		linkedList.append(thirdNode);
 		linkedList.append(fourthNode);
 		linkedList.print();
 		Assert.assertEquals(secondNode, linkedList.searchNode(30));
    }
    @Test
    public void givenNumbersTestingInsertFunction() {
    	Node<Integer> firstNode = new Node<>(70);
 		Node<Integer> secondNode = new Node<>(30);
 		Node<Integer> thirdNode = new Node<>(56);
 		Node<Integer> fourthNode = new Node<>(40);
 		LinkedList<Integer> linkedList = new LinkedList<>();
 		linkedList.add(firstNode);
 		linkedList.append(secondNode);
 		linkedList.append(thirdNode);
 		INode tempNode = linkedList.searchNode(30);
 		linkedList.insert(tempNode, fourthNode);
 		linkedList.print();
 		boolean result = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode)
 				&& linkedList.head.getNext().getNext().equals(fourthNode) && linkedList.tail.equals(thirdNode);
 		assertTrue(result);
    }
}
