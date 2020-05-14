class ExceptionAE{
public static void main(String args[]){
int a=20;
int b=0;
System.out.println("Addition= " +(a+b));
System.out.println("Multiplication= " +(a*b));
try{
System.out.println("Division= " +(a/b));
}
catch(ArithmeticException e){
System.out.println(e.getMessage());
}
System.out.println("Subtraction= " +(a-b));
}
}
