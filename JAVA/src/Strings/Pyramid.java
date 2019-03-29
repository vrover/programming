/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

public class Pyramid {
    public static void main(String[] args){
    for(int i=0;i<6;i++){
    for(int j=0;j<6-i-1;j++){
    System.out.print(" ");
    }
    int k=2*i+1;
    while(k!=0){
    System.out.print("*");
        k--;
    }
    System.out.println();
    }
    }
}
