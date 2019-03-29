/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Public
 */
public class StringRepetition {
    public static void main(String[] args) {
        String s="ncejk ";
        int n=2;
        String st=Character.toString(s.charAt(0));
        
        System.out.print(String.join(" ",Collections.nCopies(2, "nc")));
        StringBuffer sb=new StringBuffer();
       sb.append(s);
        //sb.reverse();
      //  sb.deleteCharAt(0);
        System.out.println("cv"+sb.charAt(5)+"mfv");
        String str=null;
       // String s2=null;
        //System.out.println(s2.equals(str));
        Object abc="nce";
        System.out.println(abc.toString().charAt(0));
     Object i=58;
       
  
             
             
        
        
    }
}
