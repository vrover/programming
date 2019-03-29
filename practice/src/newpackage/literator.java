/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Public
 */
public class literator {
    public static void main(String[] args){
    ArrayList a=new ArrayList();
    a.add(2);
    a.add(3);
    a.add(7);
    a.add(0);
    a.add(4);
    ListIterator li=a.listIterator();
    while(li.hasNext()){
        int i=(int) li.next();
        
        System.out.print(i);
        if(i==7){
        System.out.print(li.previous()+" ");
        }
        
    //System.out.print(li.next+" ");
    }
    System.out.println();
    System.out.print(a);
    }
    
}
