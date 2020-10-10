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

}
