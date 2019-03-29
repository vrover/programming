/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class BinaryTreeKLevelSum {
     public static void main(String[] args) throws Exception{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int j=0;j<t;j++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        String s=br.readLine();
        int level=-1;
        int sum=0;
        
        for(int i=0;i<s.length();i++){
        
            if(s.charAt(i)=='(')
                level++;
            else if(s.charAt(i)==')')
                level--;
            
            else{
             String str="";
               
            while(Character.isDigit(s.charAt(i))){
            str=str+s.charAt(i);
            i++;
            }
            i--;
                if(level==k){
                 
                sum+=Integer.parseInt(str);
                
                }
            }
        }
        System.out.println(sum);
      //  System.out.println(Character.getNumericValue());
    }
     }
}
