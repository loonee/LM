abstract class CokeFlavors{
abstract void cost();
abstract void calories();
}

class RegularCoke extends CokeFlavours{
void cost(){
system.out.println("Regular Coke costs $2.00");
}
void calories(){
system.out.println("Regular Coke has 140 calories");
}
}

class DietCoke extends CokeFlavors{
void cost(){
system.out.println("Diet Coke costs $2.50");
}
void calories(){
system.out.println("Diet Coke has 0 calories");
}
}

class VanillaCoke extends CokeFlavors{
void cost(){
system.out.println("Vanilla Coke costs $2.15);
}
void calories(){
system.out.print("Vanilla Coke has 150 calories");
} 
}

class AbstractMOR{
public static void main(String args []){
CokeFlavours x;
x=new RegularCoke(); 
x.cost();
x.calories();
x=new DietCoke();
x.cost();
x.calories();
x=VanillaCoke();
x.cost();
x.calories();
}
} 
