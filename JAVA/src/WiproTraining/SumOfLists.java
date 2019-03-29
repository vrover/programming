/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.*;

/**
 *
 * @author Public
 */
public class SumOfLists {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        l1.add(2);
        l1.add(3);
       // l1.add(4);
        l2.add(6);
        l2.add(9);
        l2.add(1);
        List<Integer> l3=new ArrayList();
       
        for(int i=0;i<Math.min(l1.size(), l2.size());i++){
        l3.add(l1.get(i)+l2.get(i));
        }
        
        List<Integer> l=new ArrayList();
        if(l1.size()<l2.size()){l=l2;}
        else l=l1;
        for(int i=Math.min(l1.size(), l2.size());i<Math.max(l1.size(), l2.size());i++){
        l3.add(l.get(i));
        }
        System.out.println(l3);
    }
}
