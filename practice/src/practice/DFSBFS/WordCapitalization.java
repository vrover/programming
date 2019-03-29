/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Public
 */
public class WordCapitalization {
     public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s=br.readLine();
     if(s.length()==1)
         System.out.print(Character.toUpperCase(s.charAt(0)));
     else
     System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1, s.length()));
     }
}
