
package Strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    void printDuplicate(String str){
    char[] ar=str.toCharArray();
    Map<Character,Integer> h=new HashMap<Character,Integer>();
    for(Character ch:ar){
    if(h.containsKey(ch))
        h.put(ch, h.get(ch)+1);
    else h.put(ch, 1);
    }
    
    for(Map.Entry m:h.entrySet()){
    System.out.println(m.getKey()+" : "+m.getValue());
    }
    }
    
    public static void main(String[] args){
    Duplicates d=new Duplicates();
    d.printDuplicate("collection");
    }
}
