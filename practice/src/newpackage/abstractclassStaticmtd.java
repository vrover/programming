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
abstract class c{
static void f(){
System.out.println("abstract class and interface can have abstract methods");
}
}
public class abstractclassStaticmtd extends c {
    public static void main(String[] arghs){
     //   c obj=new abstractclassStaticmtd();
        c.f();
    }
}
