package practice;

import java.util.Scanner;

public class Vladik_and_courtesy {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int vl=sc.nextInt();
    int va=sc.nextInt();
    int i=1;
    while(true){
        if(vl<i){
        System.out.println("Vladik");
        return;}
        else{
    vl=vl-i;}
        
        if(va<(i+1)){
            System.out.println("Valera");
            return;
        }
        else{
        va=va-(i+1);
        }
    
    i=i+2;
    }
    }
}
