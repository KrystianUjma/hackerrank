package com.company;

/**
 * Created by kamil on 2015-10-17.
 */
public class TwoWayLinkedList {

    static class Node {
        String val;
        Node next;
        Node prev;
    }

    public Node func(String[] array){

        Node node = new Node();
        Node firstNode = node;
        for(int i=0; i<array.length; i++) {
            node.val = array[i];
            node.next = new Node();

            node.next.prev = node;

            node = node.next;

        }

        return firstNode;
    }

}
