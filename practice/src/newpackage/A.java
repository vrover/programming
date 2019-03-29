/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

public class A {
    static int x=9;
    static void display(){
    System.out.print("ghed");
    }
}
class B extends A{
int y=x;
public static void main(String[] args){
System.out.println(new B().y);
new B().display();

String s="varshant";
String s2=new String("varshant");

StringBuilder b=new StringBuilder(s2);
b.reverse();
System.out.println(b);
System.out.println(s==s2);

}
}
