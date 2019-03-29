/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javalinkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.*;


class Duplicate{
public static void main(String[] args){
LinkedList ll=new LinkedList();
ll.addLast(1);
ll.addLast(2);
ll.addLast(1);
ll.addLast(3);
ll.addLast(4);
ll.addLast(1);
ll.addLast(2);
ll.addLast(3);
ll.addLast(5);
System.out.println(ll);
    ListIterator<Integer> E1=ll.listIterator();
   HashSet h=new HashSet();
  
    while(E1.hasNext()){
       if(h.add(E1.next())){
} else {
           E1.remove();
    }
    }
    System.out.println(ll);
}
}
