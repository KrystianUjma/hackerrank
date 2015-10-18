package com.company;

/**
 * Created by kamil on 2015-10-10.
 */
public class MthToLastElement {

    public static void main(String[] args) {
        int m = 4;
        int list[] = new int[] { 10, 200, 3, 40000, 5 };
        MthToLastElement solution = new MthToLastElement();
        Node prevNode = null;
        Node node = null;
        for(int i : list) {
            node = new Node(i,prevNode,null);
//            node.prev = prevNode;
            if(prevNode!=null) prevNode.next = node;
            prevNode = node;
        }


        System.out.println(solution.solve(m,node));
    }

    private String solve(int m, Node node) {
        for(int i=0; i<m; i++) {
            node = node.prev;
            if(node==null) { return "NIL"; }
        }
        if(node.next==null) { return "NIL"; }
        return node.next.val+"";
    }

    static class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }


}
