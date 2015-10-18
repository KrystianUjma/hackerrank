package com.company;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Veezq on 2015-10-18.
 */
public class TwoWayLinkedListTest {

    private TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedList();


    @Test
    public void test(){
        //given
        String[] array = new String[] { "Krystian","Kamil","Adam","Marek" };


        //when

        TwoWayLinkedList.Node node = twoWayLinkedList.func(array);

        //then

        assertTrue(node.val.equals("Krystian"));
        assertTrue(node.next.val.equals("Kamil"));
        assertTrue(node.next.next.val.equals("Adam"));
        assertTrue(node.next.next.next.val.equals("Marek"));

    }


    @Test
    public void testPreviousNodes(){
        //given
        String[] array = new String[] { "Krystian","Kamil","Adam","Marek" };

        //when

        TwoWayLinkedList.Node firstNode = twoWayLinkedList.func(array);
        TwoWayLinkedList.Node lastNode = firstNode.next.next.next;
        //then

        assertTrue(lastNode.val.equals("Marek"));
        assertTrue(lastNode.prev.val.equals("Adam"));
        assertTrue(lastNode.prev.prev.val.equals("Kamil"));
        assertTrue(lastNode.prev.prev.prev.val.equals("Krystian"));

    }

}