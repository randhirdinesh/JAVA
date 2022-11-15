import java.util.*;

interface Shape {

public void area();

public void perimeter();

}

class Circle implements Shape{

float r,area,peri;

public void area(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius: ");
r=sc.nextFloat();
area=r*r*3.14f;
System.out.println("Area of the circle is "+area);
}

public void perimeter(){
peri=2*3.14f*r;
System.out.println("Perimeter/Circumference of the circle is "+peri);
}

}

class Rectangle implements Shape{
float l,b,area,peri;

public void area(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length: ");
l=sc.nextFloat();
System.out.println("Enter breadth: ");
b=sc.nextFloat();
area=l*b;
System.out.println("Area of the rectangle is "+area);
}

public void perimeter(){

peri=(2*(l+b));
System.out.println("Perimeter of the rectangle is "+peri);
}

}

class Testinterface {

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

Circle c = new Circle() {};

Rectangle re = new Rectangle() {};

int ch, flag=1;
float r,l,b;

while(flag!=0){

System.out.println("Select an option:");
System.out.println("1 for Circle");
System.out.println("2 for Rectangle");


ch=sc.nextInt();

if (ch==1){

c.area();
c.perimeter();
}
else if (ch==2){

re.area();
re.perimeter();
}
else{
System.out.println("Invalid choice");
}

System.out.println("Do you want to continue? Press 0 to EXIT\n");
flag=sc.nextInt();

}



}

}


