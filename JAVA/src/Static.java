/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
public class Static {
    static void display(){
    System.out.println("static block");}
    void change(){
       display();
    }
    public static void main(String[] args) {
      Static a=new Static();
      a.change();
      display();
    }
    
}
