abstract class Laptop{
abstract void cost();
abstract void hardDisk();
}

class Lenovo extends Laptop{
void cost(){
System.out.println("Dell costs $650");
}
void hardDisk(){
System.out.println("Dell has 256 GB total capacity hard disk");
}
}

class Asus extends Laptop{
void cost(){
System.out.println("Asus costs $700");
}
void hardDisk(){
System.out.println("Asus has 256 GB total capacity hard disk");
}
}

class MethodOverriding{
public static void main(String args[]){
Laptop a=new Lenovo();
a.cost();
a.hardDisk();
Laptop b=new Asus();
b.cost();
b.hardDisk();
}
}

