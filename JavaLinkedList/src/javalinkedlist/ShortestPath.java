
package javalinkedlist;

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int l=sc.nextInt();
    char ar[]=new char[l];
     for(int j=0;j<l;j++){
    ar[j]= sc.next().trim().charAt(0);}
    String s =new String(ar);
    System.out.print(s);
}}
