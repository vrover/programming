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

/*class A {
 B b;
 A(){
  b = new B();
  System.out.println("A()");
 }
}
class B {
 A a;
 B(){
  a = new A();
  System.out.println("B()");
 }
}*/







/*abstract class Abc {
 static int n;
}
class Bcd implements A {
 Bcd(){
  ++n;
 }
}*/

/*class A {
 protected int someMethod(int a, int b) { 
  return 0; 
 }
}
class B extends A{
//private int someMethod(int a, int b) { return 0; }
   // private int someMethod(int a, long b) { return 0; }
   // public short someMethod(int a, int b) { return 0: }
}*/

/*interface A {
 static int n=0;
}
class B implements A {
 B(){
  ++n;
 }
}*/

/*abstract class A {
 void f1(){
  f2();
 }
 abstract void f2();
}
class B extends A {
 void f2(){
  System.out.println("Hello");
 }
}
*/
class A {
 int a=0;
 B b;
 public String toString(){
  return "a=" + a + ", b.a=" + b.a;
 }
}

class B {
 int a=1;
}


public class NewClass1 {
     public int aMethod() {
  int i = 0;
  i++;
  return i;
 }
    public static void main(String[]args){
       //B b1 = new B();
 // b1.f1();
 A a1=new A();
  System.out.println(a1);
        
  NewClass1 test = new   NewClass1();
  test.aMethod();
  int j = test.aMethod();
  System.out.println(j);
 }
}
