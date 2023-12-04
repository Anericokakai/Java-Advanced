package org.ricodev.Collections;

import java.util.ArrayList;

public class ArrayListCollection {

//    ! used when accessing and manipulating arrays
//    ? does not use primitive data types

    public static void main(String[] args) {

//   !      example

        ArrayList<Integer> list= new ArrayList<>();

/*

 ? ADDDING ELEMENTS IN AN ARRAY
 ? to add elements in an array we use the add() method
*
*
* */

//        ! example
        for (int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println(list);
//        ! removing elements
//        ? removes the element at the indexx
        list.remove(2);
//        getting elements from the arrayuse
//        ? use the get method to get elements from the array
        System.out.println( list.get(0));





    }

}
