package Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;
public class Anagrams {
   static void checkAnagram(String s1,String s2){
   String copys1 = s1.replaceAll("\\s", "").toLowerCase();
    String copys2 = s2.replaceAll("\\s", "").toLowerCase();
    char ar1[]=s1.toCharArray();
    char ar2[]=s2.toCharArray();
    if(copys1.length()!=copys2.length()){
    System.out.print("not anagrams");
    return;
    }
    HashMap<Character,Integer> h=new HashMap<Character,Integer>();
 Vector v=new Vector();
 List l=new ArrayList();
 
    for(int i=0;i<copys1.length();i++){
    if(h.containsKey(copys1.charAt(i)))
        h.put(copys1.charAt(i), h.get(copys1.charAt(i))+1);
    else h.put(copys1.charAt(i), 1);
    if(h.containsKey(copys2.charAt(i)))
        h.put(copys2.charAt(i), h.get(copys2.charAt(i))-1);
    else h.put(copys2.charAt(i), -1);
    }
    for(Entry<Character,Integer> m:h.entrySet()){
    if((int)m.getValue()!=0){
        System.out.print("not anagrams");
     return;   
    }
    }
    System.out.print(" anagrams");
   }
    public static void main(String[] args){
    checkAnagram("Toss", "Ssot");
    }
}
