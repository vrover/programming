/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.util.Scanner;

/**
 *
 * @author Public
 */

public class test1 {
     private int n = 10;
 static {
  //n = 11;
 }
 public test1(){
  n = 12;
 }
 public void print(){
  System.out.println("n="+n);
 }
 public static void main(String args[]){
     Scanner sc=new Scanner();
  test1 t = new test1();
  t.print();
 }
}
