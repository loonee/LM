class Colors{
void show(){
System.out.println("Shades");
Red r=new Red();
r.display();
}

class Red{
void display(){
System.out.println("Pink");
}
}
}

class InnerClass{
public static void main(String args[]){
Colors a=new Colors();
a.show();
}
}