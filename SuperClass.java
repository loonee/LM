class Park{
void child(){
System.out.println("There are 100 people in a park");
}
}
class Adults extends Park{
void count(){
System.out.println("70 of them are adults.");
}
void child(){
System.out.println("30 of them are childern ");
super.child();
}
}
class SuperClass{
public static void main(String args[]){
Adults a=new Adults();
a.child();
a.count();
}
}