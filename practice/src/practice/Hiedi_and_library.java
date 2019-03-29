
package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hiedi_and_library {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=sc.nextInt();
      int cost=0;
      ArrayList ar=new ArrayList();
     ArrayList cr=new ArrayList();
      for(int i=0;i<n;i++){
      ar.add(sc.nextInt());
      }
      
      Iterator i=ar.listIterator();
      
      while(i.hasNext()){
          int v=(int)i.next();
      if(!cr.contains(v) && (cr.size()!=c)){
      cr.add(v);
      cost=cost+1;
      
      }
      else if(!cr.contains(v) && (cr.size()==c)){
      Iterator j=cr.listIterator();
      int max=0;
      int notexist=0;
      while(j.hasNext()){
          int t=(int)j.next();
          if((int)ar.indexOf(t)==-1){
          max=cr.indexOf(t);
          notexist=1;
          
          break;
          }
          if((int)ar.indexOf(t)>max  && ((int)ar.indexOf(t))!=-1){
      max=ar.indexOf(t);
              }
      }
     // int replace=(int)ar.get(max);
     
     if(max==0 || notexist==1){cr.set(max,v);
     cost=cost+1;
     
     }
     else{
      int index=cr.indexOf(ar.get(max));
      cr.set(index,v);
     cost=cost+1;}
  
      }
      i.remove();
      
      }
      System.out.println(cost);
    }
    
}
