/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

/**
 *
 * @author Public
 */
interface First{
 public void display();
}

class Second implements First{
 public void display(){
  System.out.println("Class Second method");
 }
}

class Third extends Second{
 public void display(){
  System.out.println("Class Third method");
 }
}

public class Test8 extends Two{
 public static void main(String[] args){
  First first = new Third();
  display();
 }
}