/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Public
 */
import java.io.*;
import java.util.*;
public class BufferedReaderExample {
 public static void main(String[] args) throws IOException{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 StringTokenizer st=new StringTokenizer(br.readLine());
int x= Integer.parseInt(st.nextToken());
char c[]=(st.nextToken()).toCharArray();
String s=st.nextToken();
//String s=br.readLine();
int a=Character.getNumericValue(br.read());
System.out.println(x);
System.out.println(c);
//System.out.println(s);
System.out.println(s);
System.out.println(a);
 
 }   
}
