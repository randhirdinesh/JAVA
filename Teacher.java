/* create a class Person with data members name, gender, address, age and a constructor to initialize the data members and another class Employee that inherits the properties of class Person and also contains its own data members like empid, company name, qualification, salary and constructor to initialize. 
Create another class Teacher that inherits the properties of Employee and contains its own data like subject, department, teacher_id and also contains constructor and methods to display the data members.
Use array of objects to display details of "n" teachers */

import java.util.*;

class Person{

public String name;
public String gender;
public String address;
public int age;

public Person(String n, String g, String add, int age){
name=n;
gender=g;
address=add;
age=age;

}

}

class Employee extends Person{

public String empid;
public String company_name;
public String qualification;
public float salary;

public Employee(String id, String c, String q, float sal, String n, String g, String add, int age){

super(n,g,add,age);

empid=id;
company_name=c;
qualification=q;
salary=sal;



}




}

class Teacher extends Employee{

public String subject;
public String department;
public String teacher_id;


public Teacher(String sub, String dept, String tid, String id, String c, String q, float sal, String n, String g, String add, int age){
super(id, c, q, sal, n, g, add, age);

subject=sub;
department=dept;
teacher_id=tid;
}

public void display(){
System.out.println("Teacher:");
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Address: "+address);
System.out.println("Age: "+age);
System.out.println(" ");
System.out.println("Employee id: "+empid);
System.out.println("Company name: "+company_name);
System.out.println("Qualification: "+qualification);
System.out.println("Salary: "+salary);
System.out.println(" ");
System.out.println("Teacher id: "+teacher_id);
System.out.println("Subject: "+subject);
System.out.println("Department: "+department);

}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);


//Teacher t = new Teacher("Databases","MCA","T123","24343","CET","B.Tech",500000, "Ana","female","#19-Rose Villa, Kochi", 25);
//t.display();

System.out.println("Enter no. of teachers: ");
int n = sc.nextInt();

Teacher[] list = new Teacher[20];

System.out.println("Enter teachers' data: \n\n");
for (int i=0; i<n; i++){

System.out.println("Enter name: ");
String name=sc.next();
System.out.println("Enter gender: ");
String gen=sc.next();
System.out.println("Enter age: ");
int ag=sc.nextInt();
System.out.println("Enter address: ");
String ad=sc.next();

System.out.println("Enter employee id: ");
String eid=sc.next();
System.out.println("Enter company name: ");
String cn=sc.next();
System.out.println("Enter qualification: ");
String qu=sc.next();
System.out.println("Enter salary: ");
float salary=sc.nextFloat();

System.out.println("Enter teacher id: ");
String tid=sc.next();
System.out.println("Enter subject: ");
String sub=sc.next();
System.out.println("Enter department: ");
String dep=sc.next();

list[i]= new Teacher(sub,dep,tid,eid,cn,qu,salary,name,gen,ad,ag);



}


System.out.println("\n\n Displaying teacher details: \n");
for(int i=0; i<n; i++){
list[i].display();
System.out.println("\n\n");
}


}

}

