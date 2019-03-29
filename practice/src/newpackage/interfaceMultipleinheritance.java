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
interface i{
void a();
void b();
}
interface i1{

}
interface i2{

}
interface i3 extends i1,i2{

}
class interfaceMultipleinheritance implements i {
      public void a(){
    System.out.println("hjsc");
    }
      public void b(){}
    public static void main(String[] args) {
      
    }
}
