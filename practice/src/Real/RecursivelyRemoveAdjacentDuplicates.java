/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Public
 */
public class RecursivelyRemoveAdjacentDuplicates  {
    void r(ArrayList s){
     Boolean flag=true;
     for(int i=0;i<s.size();i++){
         System.out.println(s.size());
     if(i+1<s.size() && s.get(i+1).equals(s.get(i))){
         flag=false;
        char c=(char)s.get(i);
        System.out.println(c);
        System.out.println(s);
     while(i<s.size() && s.get(i).equals(c)){
     s.remove(i);
    // System.out.println(i);
     }
     }
     else{
         System.out.println(i);
     i++;}
     }
     if(flag){System.out.print(s);}
     else
     r(s);
      
      
        }
            
    
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++){
    String s=br.readLine();
    ArrayList<Character> al=new ArrayList<Character>();
    for(int i=0;i<s.length();i++){
    al.add(s.charAt(i));
    }
    
          new RecursivelyRemoveAdjacentDuplicates().r(al);
    }
    
    }
}
