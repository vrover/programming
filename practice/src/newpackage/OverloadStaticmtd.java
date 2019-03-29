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

public class OverloadStaticmtd {
    static void fun(){
System.out.println("compile time polymorphism");
}
    static void fun(int x){
    System.out.println("overloaded");
    }
    public static void main(String[] args){
OverloadStaticmtd ob=new OverloadStaticmtd();
ob.fun();
System.out.println(ob);
    }
}
