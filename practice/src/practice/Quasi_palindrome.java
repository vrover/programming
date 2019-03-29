/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Public
 */
public class Quasi_palindrome {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char c[]=br.readLine().toCharArray();
    int n=c.length;
    int start=0;
    int countstart=0;
    while(c[start]=='0'){
    countstart++;
    start++;
    }
    int countend=0;
    int end=c.length-1;
    while(c[end]=='0'){
    countend++;
    end--;
    }
    if(countstart>countend){
     System.out.println("NO");
    }
    else{
    boolean y=true;
    for(int i=0;i<=(end-start)/2;i++){
        
        
        if( c[start+i]!=c[end-i]){
         
        y=false;}
    }
    
    if(y==false)
    System.out.println("NO");
    else
        System.out.println("YES");
    }
  
    }
}
