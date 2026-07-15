// class Pen {
//     String color;
//     String type; //ballpoint; gel pen

//     public void write() {
//         System.out.println("Writting something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void penType() {
//         System.out.println(this.type);
//     }
// }

class Student {
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student() {
    //     System.out.println("Constructer called");
    // }
    // Student(String name, int age)
    // {
    //      this.name = name;
    //      this.age = age;
    // }
    Student(Student s2)
    {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student()
    {
            
        }
}
public class oops {
    public static void main(String args[])
    // {
    //     Pen pen1 = new Pen();
    //     pen1.color = "blue";
    //     pen1.type = "gel";

    //     Pen pen2 = new Pen();
    //     pen2.color = "balck";
    //     pen2.type = "gel";

    //     pen1.write();
    //     System.out.println(pen1.color);
        
    //     pen1.printColor();
    //     pen2.printColor();

    //     pen1.penType();
    //     pen2.penType();
    // }

    {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
        
    } 
}
