/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.Iterator;
import javafx.util.Pair;

public class pair implements Comparator<Pair> {
    public int compare(Pair o1,Pair o2){
        Integer i1=(Integer)o1.getKey();
        Integer i2=(Integer)o2.getKey();
        return i1.compareTo(i2);
    }
    public static void main(String[] args){
   ArrayList<Pair<Integer,Integer>> al=new ArrayList<>();
   
   Integer i=2;
   al.add(new Pair(i,6));
   al.add(new Pair(3,5));
   al.add(new Pair(1,8));
   al.add(new Pair(9,5));
   al.sort(new pair());
   System.out.println(al);
           
           
           }
}
