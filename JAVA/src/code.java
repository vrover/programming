/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
public class code {
    public static void main(String[] args) {
        String front="";
        String middle="";
        String end="";
        String s="varshan";
        if(s.length()%3==0){
   front=s.substring(0, s.length()/3);
   middle=s.substring(s.length()/3, 2*s.length()/3);
   end=s.substring(2*s.length()/3,3*s.length()/3);
   
    }
        else if(s.length()%3==1){
        front=s.substring(0, s.length()/3);
        middle=s.substring(s.length()/3,2*s.length()/3+1);
        end=s.substring(2*s.length()/3+1, s.length());
        }
        
        else if(s.length()%3==2){
        front=s.substring(0, s.length()/3+1);
        middle=s.substring(s.length()/3+1,2*s.length()/3);
        end=s.substring(2*s.length()/3, s.length());
        }
        System.out.println(front+" "+middle+" "+end);
    }
}
