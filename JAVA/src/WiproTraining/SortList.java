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
public class SortList implements Comparator<String> {
    public int compare(String s1,String s2){
        Integer l1=s1.length();
        Integer l2=s2.length();
        if((int)l1==(int)l2){
        return s1.compareTo(s2);
        }
    return l1.compareTo(l2);
    }
    public static void main(String[] args) {
        String s="java bcd abc";
        
      if(s==null){
          List<String> a=new ArrayList();
         
     }
        String words[]=s.split("\\s+");
        List<String> l=Arrays.asList(words);
        Arrays.sort(words,new SortList());
        System.out.println(l);
    }
}
