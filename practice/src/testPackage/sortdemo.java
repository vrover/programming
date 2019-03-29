/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Public
 */
public class sortdemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(5);
        al.add(9);
        al.add(0);
        int[] a={1,9,3,4,7,5,6};
        Collections.sort(al, new Comparator<Integer>(){
         public int compare(Integer x,Integer y){
         return x.compareTo(y);
         }
    });
        Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        
        
    }
            
}
