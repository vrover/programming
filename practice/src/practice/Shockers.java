/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;
public class Shockers {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    HashSet<Character> s=new HashSet<Character>();
    HashSet<Character> d=new HashSet<Character>();
    int i=0;
    int count=0;
    for(i=0;i<n;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        String sign=st.nextToken();
    
        if(sign.equals("?")){
            
            char c=st.nextToken().charAt(0);
            if(s.contains(c)){s.remove(c);}
                d.add(c);}
        else if(sign.equals("!")){
            String word=st.nextToken();
          if(s.isEmpty()){
            for(int j=0;j<word.length();j++){
        if(!d.contains(word.charAt(j))){s.add(word.charAt(j));}
        }}
          else{
         Iterator itr=s.iterator();
       
         while(itr.hasNext()){
         String x=itr.next().toString();
         if(!word.contains(x)){itr.remove();}
         }
         
          }
        }
        else if(sign.equals(".")){
        String word=st.nextToken();
        for(int j=0;j<word.length();j++){
        if(s.contains(word.charAt(j))){s.remove(word.charAt(j)); }
        d.add(word.charAt(j));
        }
        }
        if(s.size()==1)
            break;
       if(d.size()==25) { break;}
    }
    if(i==n)
        System.out.println(0);
    else{
        
        
        while(i!=n-2){
           
        StringTokenizer st1=new StringTokenizer(br.readLine());
        String str=st1.nextToken();
        if(str.equals("!") || str.equals("?"))
            count++;
        i++;
        }
        br.readLine();
        System.out.println(count);
    }
    }
}
