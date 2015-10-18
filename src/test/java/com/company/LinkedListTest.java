package com.company;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Veezq on 2015-10-18.
 */
public class LinkedListTest {

    private LinkedList linkedList = new LinkedList();

    @Test
    public void test(){
        //given
        String[] array = new String[] { "Krystian","Kamil","Adam","Marek" };


        //when

        LinkedList.Node node = linkedList.func(array);

        //then

        assertTrue(node.val.equals("Krystian"));
        assertTrue(node.next.val.equals("Kamil"));
        assertTrue(node.next.next.val.equals("Adam"));
        assertTrue(node.next.next.next.val.equals("Marek"));
        assertNull(node.next.next.next.next.next);


    }

}