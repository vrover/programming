/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class B598 {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    int q=Integer.parseInt(br.readLine());
    for(int i=0;i<q;i++){
    StringTokenizer st=new StringTokenizer(br.readLine());
    int l=Integer.parseInt(st.nextToken())-1;
    int h=Integer.parseInt(st.nextToken());
    String str=s.substring(l, h);
    int length=str.length();
    int k=Integer.parseInt(st.nextToken());
    char c[]=str.toCharArray();
    for(int j=0;j<length;j++){
    c[(j+k)%length]=str.charAt(j);
    }

    String n;
    if(h==s.length()){ n=s.substring(0, l)+new String(c);}
    else{
      n=s.substring(0, l)+new String(c)+s.substring(h, s.length());}
  
    s=n;
   
    }
    System.out.println(s);
    }
}
