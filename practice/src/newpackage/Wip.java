/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author Public
 */
public class Wip {
    
     static boolean printChar(char c) {
  System.out.print(c);
  return true;
 }
    public static void main(String[] args) {
int i = 1,j = 10;
do {
 if(i>j) {
  break;
 }
 j--;
} while (++i <5);
System.out.println("i =" +i+" and j = "+j);


/*float fl[], f2[];
  fl = new float[10];
  f2 = f1;
  System.out.println("f2[0]= " + f2[0]);*/

  
/*  int x = 3;
int y = 1;
if (x = y) {
 System.out.println("x = " + x);
 */
 
int n = 10;
switch(n++){
 case 10:
  System.out.println("n="+ --n);
  break;
 case 11: 
  System.out.println("n="+ ++n);
  break;
}

String str = "manipal";
str.replaceAll("n", "h");
System.out.println("str="+str);

//float f[] = new float(3);


  boolean flag=false; int l=0;
  do {
   flag = false;
   System.out.println( l++ );
   flag = l < 10;
   continue;
  } while ( flag? true:false );

/*int x = 1, y = 6;
while (y--) {
 x++;
}
System.out.println("x =" + x + "y =" +y); */

int p = 10;
int q = ++p + p++;
System.out.println("p=" + p + ", q=" + q);


boolean bool = true;
if(bool = true) {
 System.out.println("a");
} else if (bool) {
 System.out.println("c");
} else if (!bool) {
 System.out.println("c");
} else {
 System.out.println("d");
}

/*String stri = "manipal";
stri.charAt(2) = 'h';
System.out.println("str="+stri);*/


 int k =0;
  for ( printChar('A'); printChar('B')&&(k<2); printChar('C')){
   k++ ;
   printChar('D');
  }


 String a = null;
a.concat("abc");
a.concat("def");
System.out.println(a);



        if(args.length<2){System.out.print("2 inputs were not supplied"); return;}
           try{
       Integer.parseInt(args[0]);
       Integer.parseInt(args[1]);
       }
       catch(NumberFormatException e){
           System.out.println("A non-integer input was given");
           return;
       }
        if(Integer.parseInt(args[1])==0){System.out.print("Attempted to divide by zero"); return;}
    
        System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
    }
}
