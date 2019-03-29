/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Public
 */
public class PatternCount {
    public static void main(String[] args) throws Exception{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++){
    String s=br.readLine();
    char a[]=s.toCharArray();
    int count=0;
    int i=0;
    while(i<a.length){
    if(a[i]=='1' && i<a.length-1 && a[i+1]=='0'){
        i++;
    while(i<a.length && a[i]=='0')
        i++;
    if(i<a.length && a[i]=='1'){
        count++;
    i--;
    }
    }
    i++;
    }
    System.out.println(count);
    }
    }
    }

