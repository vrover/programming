/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
import java.util.*;
/**
 *
 * @author Public
 */
public class LongestSubstringUniqueCh {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char a[]=str.toCharArray();
    int s=0;
    int r=1;
    boolean flag[]=new boolean[256];
    flag[a[0]]=true;
    for(int i=1;i<a.length;i++){
    
        if(flag[a[i]]){
        r=Math.max(r, i-s);
        
        for(int k=s;k<i;k++){
        if(a[k]==a[i]){
        s=k+1;
        break;
        }
        flag[a[k]]=false;
        }
        }
        else{
        flag[a[i]]=true;
        }
    
    }
    r=Math.max(a.length-s, r);
            System.out.println(r);
            }
}
