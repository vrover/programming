/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author Public
 */
public class formatter {
    public static void main(String[] args){
    Formatter fmt=new Formatter();
    fmt.format("%,d%n", 1200000000);
    fmt.format("%.5f%n", 10.567942484);
    fmt.format("%x%n",15);
    String s="18-10-1995";
    SimpleDateFormat d=new SimpleDateFormat("DD-HH-MM");
    String st=d.format(s);
    
    fmt.format("%tA%n", d);
    fmt.format("%tY%n", d);
    fmt.format("%tB", d);
    
    System.out.println(fmt);
   System.out.println( String.format("%.7s", "Hello mr"));
    
    }
}
