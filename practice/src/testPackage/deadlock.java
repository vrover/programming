package testPackage;
class deadlock{
public static void main(String args[]){
String r1="r1 allocated";
String r2="r2 allocated";
Thread t1=new Thread(){
public void run(){
synchronized(r1){
System.out.println("thread 1 : resource 1 allocated");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){};
synchronized(r2){
	System.out.println("thread 1 : resource 2 allocated");
}
}

}
};
Thread t2=new Thread(){
public void run(){
synchronized(r2){
System.out.println("thread 2 : resource 2 allocated");
try{
Thread.sleep(1000);
}
catch(InterruptedException e){};
synchronized(r1){
	
	System.out.println("thread 2 : resource 1 allocated");
}
}

}
};
t2.start();
t1.start();

}

}