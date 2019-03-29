/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Public
 */

public class NewInterface {
    
    
public String identifyPossibleWords(String input1,String input2){
String i1=input1.toLowerCase();
String words[]=input2.split(":");
String f="";
ArrayList<String> al=new ArrayList<String>();
for(int i=0;i<26;i++){
String s=i1.replace('_', (char)('a'+i));
al.add(s.toLowerCase());
}
for(String str:words){
if(al.contains(str.toLowerCase())){
f+=str.toUpperCase();
f+=":";}
}
if(f.equals("")){return "ERROR-009";}
else{
return f.substring(0, f.length()-1);
}
}
    
    
    
    public static void main(String[] args) {
        int a[]={1,2,10,5};
Arrays.sort(a);
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(7);
        l.add(1);
        Collections.sort(l,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
return o1.compareTo(o2);

            }
        });
        
        
  System.out.println( new NewInterface().identifyPossibleWords("t_xer", "Thank:Timer:tiger:trial:fixer:final:Alpha:tiler:Tiles:tider"));
        
    }
            
}
