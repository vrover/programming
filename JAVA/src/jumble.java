
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
public class jumble {
   Scanner sc=new Scanner(System.in);
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   String w1=sc.next();
   String w2=sc.next();
   Random r = new Random();
    String w = scramble( r, w1 );
    System.out.println("After : " + w );
}
