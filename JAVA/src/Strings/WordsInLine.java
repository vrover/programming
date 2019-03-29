
package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class WordsInLine {
    
    
    public static void main(String[] args){
    String s="i love my  country    education iris apple";
    String[] words=s.split(" +");
    for(String str:words){
    if(str.startsWith("a")||str.startsWith("e")||str.startsWith("i")||str.startsWith("o")||str.startsWith("u"))
     System.out.println(str);
        }
  HashSet h=new HashSet();
  List l=new ArrayList(h);
  
    }
}
