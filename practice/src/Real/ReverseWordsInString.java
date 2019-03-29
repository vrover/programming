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
public class ReverseWordsInString {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
        String s=br.readLine();
        String[] words=s.split("\\.");
       
        for(int i=words.length-1;i>0;i--)
            System.out.print(words[i]+".");
        System.out.println(words[0]);}
    }
}
