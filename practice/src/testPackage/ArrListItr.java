/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Public
 */
public class ArrListItr {
    public static void main(String[] args){
    ArrayList a=new ArrayList();
    a.add(0);
    a.add(1);
    ListIterator itr=a.listIterator();
    while(itr.hasNext()){
    int x=(int)itr.next();
    if(x==0)
        itr.remove();
    }
    System.out.println(a.get(0));
    }
}
