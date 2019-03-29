
package stack;

public class TwoStack {
    int ar[]=new int[20];
    int top1=-1,top2=20;
   void push1(int data){
       if((top2-top1-1)!=0){
       ar[++top1]=data;}
       //top1=top1+1;}
    }
   void push2(int data){
       if((top2-top1-1)!=0){
   ar[--top2]=data;}
   //top2=top2-1;}
   }
   void pop1(){
       if(top1!=-1)
   top1=top1-1;
   }
   void pop2(){
   if(top2!=20)
       top2=top2+1;
       }
    
    public static void main(String[] args){
    TwoStack ts=new TwoStack();
    ts.push1(0);
    ts.push1(1);
    ts.push1(2);
    ts.push1(3);
    ts.push1(4);
    ts.push2(19);
    ts.push2(18);
    ts.push2(17);
    ts.push2(16);
    ts.pop1();
    ts.pop2();
    System.out.println(ts.ar[ts.top1]+"  "+ts.ar[ts.top2]);
    
    }
}
