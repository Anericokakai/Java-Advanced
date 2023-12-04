package org.ricodev.Collections;

import java.util.LinkedList;

public class LinkedListCollection {
//     implements the linked list data structures


    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<5;i++){
list.add(i);
        }

        System.out.println(list);
//        access the first element of the list
        System.out.println(list.peek());
// remove the first element
        list.pop();
        System.out.println(list);

    }

}
