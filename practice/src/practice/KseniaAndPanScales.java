/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KseniaAndPanScales {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] strr=str.split("\\|");
        String s[]=new String[2];
        if(strr.length==0){s[0]=s[1]="";}
        else{
        s[0]=strr[0];
       if(strr.length==1){s[1]="";}
       else
           s[1]=strr[1];}
       
        String e=br.readLine();
        int d=e.length()-(Math.max(s[0].length(),s[1].length())-Math.min(s[0].length(),s[1].length()));
        if(d<0){System.out.println("Impossible");}
        else if(d==0){
      if(s[0].length()<s[1].length())
            System.out.print(s[0]+e+"|"+s[1]);
        else
             System.out.print(s[0]+"|"+s[1]+e);
        }
        else if(d>0){
        if(d%2!=0){System.out.println("Impossible");}
        else{
        if(s[0].length()<=s[1].length())
            System.out.print(s[0]+e.substring(0, e.length()-d)+e.substring(e.length()-d, (e.length()-d)+d/2)+"|"+s[1]+e.substring((e.length()-d)+d/2, e.length()));
        else
            System.out.print(s[0]+e.substring(e.length()-(d/2), e.length())+"|"+s[1]+e.substring(0, e.length()-(d/2)));
        }
        }
    
    }
    
}
