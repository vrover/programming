/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

/**
 *
 * @author Public
 */
public class wiproLast {
    public int characterstoberemoved(String input){
        String in=input.toLowerCase();
    HashMap<Character,Integer> h=new HashMap<Character,Integer>();
    int evenCount=0;
    int oddCount=0;
    boolean odd=false;
    for(int i=0;i<in.length();i++){
    if(h.containsKey(in.charAt(i))){
    h.put(in.charAt(i), (int)h.get(in.charAt(i))+1);}
    else{h.put(in.charAt(i), 1);}
    }
    for(Entry e:h.entrySet()){
    int count=(int)e.getValue();
    if(count%2==0)
        evenCount+=count;
    else{evenCount+=count-1; odd=true;}
    }
    if(evenCount==0)return -1;
    else if(evenCount!=0 && odd==false) return in.length();
    else{return evenCount+1;}
    }
    public static void main(String[] args) {
       System.out.println( new wiproLast().characterstoberemoved("temp"
               + ""));
    }
}
