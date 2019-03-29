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
public class Between_the_offices {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    char c[]=br.readLine().toCharArray();
    int se=0,fr=0;
    for(int i=0;i<c.length-1;i++){
    if(c[i]=='S'&&c[i+1]=='F')
        se++;
    else if(c[i]=='F'&&c[i+1]=='S')
        fr++;
    }
    if(se>fr)
    System.out.println("YES");
    else{
    System.out.println("NO");}
    
    }
}
