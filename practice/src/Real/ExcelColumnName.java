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
public class ExcelColumnName {
    public static void main(String[] args) throws Exception{

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
     for(int j=0;j<t;j++){
     int x=Integer.parseInt(br.readLine());
     String str="";
      while(x>0){
      int r=x%26;
      
      if(r==0){
      str=str+'Z';
      x=(x/26)-1;
      }
      else{
      str=str+(char)(r+'A'-1);
      x=x/26;
      }
      
      }
      StringBuilder b=new StringBuilder(str);
      b.reverse();
      System.out.println(b);
     }
    }
}
