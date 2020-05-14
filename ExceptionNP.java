class ExceptionNP{
public static void main(String args[]){
int a=20;
int b=0;
System.out.println("Addition= " +(a+b));
System.out.println("Multiplication= " +(a*b));
try{
System.out.println("Division= " +(a/b));
}
catch(NullPointerException n){
n.printStackTrace();
}
System.out.println("Subtraction= " +(a-b));
}
}
