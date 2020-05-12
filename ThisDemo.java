class Employee{
int id;
double salary;
String department;
Employee(int id, double salary, String department){
this.id=id;
this.salary=salary;
this.department=department;
}

void display(){
System.out.println("Employee id: "+id);
System.out.println("salary: "+salary);
System.out.println("dept: "+department);
}
}

class ThisDemo{
public static void main(String args[]){
Employee e=new Employee(25,45000,"Marketing");
e.display();
}
}