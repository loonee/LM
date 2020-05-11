interface Electronics{
void cost();
}
abstract class Smartphone implements Electronics{
void carrier(){
System.out.println("Every smartphones has carrier.");
}
}
abstract class Laptop implements Electronics{
void webcamera(){
System.out.println("Every laptop has webcamera.");
}
}
class Iphone extends Smartphone{
public void cost(){
System.out.println("Iphone costs between 600 to 1200");
}
}
class Samsung extends Smartphone{
public void cost(){
System.out.println("Samsung costs between 500 to 1100.");
}
}
class Lenovo extends Laptop{
public void cost(){
System.out.println("Lenovo costs between 600 to 800.");
}
}
class Asus extends Laptop{
public void cost(){
System.out.println("Asus costs between 700 to 900.");
}
}

class InterfaceElec{
public static void main(String args[]){
Smartphone a=new Iphone();
a.cost();
a=new Samsung();
a.cost();
a.carrier();
Laptop b=new Lenovo();
b.cost();
b=new Asus();
b.cost();
b.webcamera();
}
}