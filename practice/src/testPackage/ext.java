/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Public
 */class y{

 }
public class ext {
 
    public static void main (String[] args) {
    String s="123csgxgHUYGWU#%@%$csgf53265";
    Scanner sc=new Scanner(System.in);
    char[] ar=s.toCharArray();
    for(char ch:ar){
    if((ch>='0' && ch<='9') ||( ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
        System.out.print(ch+" ");
                }
    }
    Stack st=new Stack();
    st.add(2);
    st.add(3);
    st.add(5);
    st.add(7);
    st.sort(Comparator.naturalOrder());
    System.out.println(st);
    st.pop();
     System.out.println(st);
/*for(int i=0;i<2;i++){
     
    String str=sc.nextLine();
    System.out.println(str.charAt(str.length()-1));}
        */
    }
}