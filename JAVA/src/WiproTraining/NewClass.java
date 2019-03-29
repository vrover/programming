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
 static void method1(){
  System.out.println("A.method1");
 }
}
class B extends A {
 static void method1(){
  System.out.println("B.method1");
 }
}*/





class TestSuper {
 TestSuper(int i) { }
}
/*class TestSub extends TestSuper { }
abstract class Super {
 public float getNum() { return 3.0f; }
}
 class Sub extends Super {
    public void getNum(int x) { }
}*/
public class NewClass {
   public static void main(String[]args){
     A a1 = new B();
  a1.method1();
   }
}
