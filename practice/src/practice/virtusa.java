/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Public
 */
import java.io.*;
public class virtusa {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char c[]=br.readLine().toCharArray();
    for(char ch:c){
      
   if(Character.isDigit(ch)){
   System.out.println("INVALID");
   return;
   }
    }
    System.out.println("VALID");
    }
    
}
