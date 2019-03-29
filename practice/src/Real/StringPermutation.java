/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Public
 */
public class StringPermutation {
    void permute(char a[],int count[],char result[],int level ){
    
        if(level==result.length){
        printResult(result);
        return;
        }
        
        for(int i=0;i<a.length;i++){
        if(count[i]==0)
            continue;
        result[level]=a[i];
        count[i]--;
        permute(a,count,result,level+1);
        count[i]++;
        }
    }
    
    void printResult(char result[]){
    for(int i=0;i<result.length;i++)
        System.out.print(result[i]);
        System.out.println();
    }
    
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
            
            String s=br.readLine();
            char result[]=new char[s.length()];
            Map<Character,Integer> m=new TreeMap<Character,Integer>();
            for(int i=0;i<s.length();i++){
                if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), (int)m.get(s.charAt(i))+1);
                }  
                else
                    m.put(s.charAt(i),1);
            }
            int count[]=new int[m.size()];
            char a[]=new char[m.size()];
            int k=0;
            for(Entry<Character,Integer> e:m.entrySet()){
            count[k]=e.getValue();
            a[k]=e.getKey();
            k++;
            }
           new StringPermutation().permute(a,count,result,0);
        }
            
        }
        }

