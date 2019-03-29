/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;



/**
 *
 * @author Public
 */
public class sortll implements Comparator {
    public int compare(Object obj1,Object obj2){
        Integer i1=(Integer) obj1;
    Integer i2=(Integer) obj2;
    return -i1.compareTo(i2);
    }
    	public static void printPattern(int n)
	{
		String s="*";
     for(int i=1;i<=n;i++){
     	System.out.println(String.join("", Collections.nCopies(i, s)));
     }
     for(int i=n-1;i>0;i--){
     	
     		System.out.println(String.join("B", Collections.nCopies(i, s)));
     }
	}
    
    public static void main(String[] args){
        new sortll().printPattern(7);
        String str="*";
        String stri=String.join("", Collections.nCopies(3, str));
System.out.println(stri);
        String a[]=new String[5];
        a[1]="vsjhec";
        a[2]="jhf";
        a[3]="gjedvb";
        a[4]="ghdvb";
        a[0]="yuihvf";
      Arrays.sort(a, Collections.reverseOrder());
      for(int i=0;i<5;i++){
      System.out.println(a[i]);
      }
    LinkedList ll=new LinkedList();
    ll.add(3);
    ll.add(1);
    ll.add(5);
    ll.add(6);
   
    ll.sort(Comparator.naturalOrder());
   
            
            /*new Comparator<String>() { 
        @Override public int compare(String s1, String s2) {
            return s1.length() - s2.length(); } } );*/
    
    System.out.println(ll);
     ll.sort(Comparator.reverseOrder());
     System.out.println(ll);
    }
}
