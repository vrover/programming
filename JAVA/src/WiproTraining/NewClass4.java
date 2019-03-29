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
public class NewClass4 {
    public static void main(String[] args) {
        double i=Math.pow(2, 40);
        int x=0;
        double y=1;
        int count=2;
        double n=1;
        while(n<=i){
        count++;
        double t=n;
        n=n+y;
        y=n;
        
        }
        System.out.println(count); 
   }
}
