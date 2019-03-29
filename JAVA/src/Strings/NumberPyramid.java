/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author Public
 */
public class NumberPyramid {
     public static void main(String[] args){
    for(int i=0;i<5;i++){
    for(int j=0;j<6-i-1;j++){
    System.out.print(" ");
    }
    int k=2*i+1;
    int count=i+1;
    int visited=0;
    while(k!=0){
        if(count<2*i+1 && visited<i){
    System.out.print(count++);
        visited++;}
        else{
        System.out.print(count--);
        }
        k--;
    }
    System.out.println();
    }
    }
}
