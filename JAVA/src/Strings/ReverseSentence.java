/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Public
 */
import java.util.*;
public class ReverseSentence {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String ar[]=s.split(" ");
    StringBuilder sb=new StringBuilder();
    for(int i=ar.length-1;i>=0;i--){
    sb.append(ar[i]);
    sb.append(" ");
    }
    System.out.println(sb.toString());
    }
}
