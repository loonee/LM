interface Vehicle{
void speed();
void cost();
}
abstract class Car implements Vehicle{
void wiper(){
System.out.println("Every car has wipers");
}
}
abstract class Bike implements Vehicle{
void stand(){
System.out.println("Every bike has stand");
}
}
class Audi extends Car{
public void speed(){
System.out.println("Audi speed varies from 120 to 180");
}
public void cost(){
System.out.println("Audi cost varies from 90 lakhs to 2cr");
}
}
class Bmw extends Car{
public void speed(){
System.out.println("BMW speed varies from 150 to 220");
}
public void cost(){
System.out.println("BMW cost varies from 2cr to 5cr");
}
}
class Fz extends Bike{
public void speed(){
System.out.println("Fz speed varies from 70 to 140");
}
public void cost(){
System.out.println("Fz cost varies from 1lakh to 3lakhs");
}
}
class Apache extends Bike{
public void speed(){
System.out.println("Apache speed varies from 90 to 160");
}
public void cost(){
System.out.println("Apache cost varies from 2lakhs to 4lakhs");
}
}

class InterfaceDemo{
public static void main(String args[]){
Bike x=new Fz();
x.speed();
x.cost();
x.stand();
x=new Apache();
x.speed();
x.cost();
x.stand();
Car y=new Audi();
y.cost();
y.speed();
y.wiper();
y=new Bmw();
y.cost();
y.speed();
y.wiper();
}
}