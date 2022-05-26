package Collections;

import java.util.ArrayList;
import java.util.Scanner;

 class Student {
    int id;
    String name;
    long cno;

    public String toString()
    {
        return "Student id:"+id+"\nStudent name:"+name+"\nStudent cno:"+cno;
    }
    Student()
    {
    }

    Student(int id)
    {
        this.id=id;

    }
    Student(int id,String name)
    {
        this(id);
        this.name=name;

    }
    Student(int id,String name,long cno)
    {
       this(id,name);
        this.cno=cno;
    }

}

 class School {
    Student a;
    ArrayList<Student> al=new ArrayList();
    static Scanner s1=new Scanner(System.in);


    public void addStudent()
    {
        System.out.println("Enter the Student id:");
        int id=s1.nextInt();
        System.out.println("Enter the Student name:");
        String name=s1.next();
        System.out.println("Enter the Student cno:");
        long cno=s1.nextLong();

        this.a=new Student(id,name,cno);
        al.add(a);


    }

    public void studentDetails()
    {
        System.out.println("Student id:");
        int  newId=s1.nextInt();
        for(Student a:al)
        {
            if(a.id==newId)
            {
                System.out.println(a);
                return;
            }
        }
        System.out.println("Student found");

    }

    public void updateStudent()
    {
        System.out.println("Enter the Student id:");
        int newId=s1.nextInt();
        for(Student a:al)
        {
            if(a.id==newId)
            {
                System.out.println("Enter the name of the Student:");
                String name=s1.next();
                a.name=name;
                System.out.println("Student name is updated");
                return;
            }
            System.out.println("Student not found");
        }

    }

    public void removeStudent()
    {
        System.out.println("enter the student id:");
        int newId=s1.nextInt();
        for(Student a:al)
        {
            if(a.id==newId)
            {
                al.remove(a);
                return;
            }
            System.out.println("Student does not exist");
        }

    }

}

public class SchoolDriver {
    public static void main(String[] args) {
        School s = new School();
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println("1)Add Student\n2)Display Student\n3)Update Name\n4)Remove Arrow\n5)Exit\nEnter your choice:");
            int ch = s1.nextInt();
            switch (ch) {
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    s.studentDetails();
                    break;
                case 3:
                    s.updateStudent();
                    break;
                case 4:
                    s.removeStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter the correct input!");
            }

        }

    }
}

