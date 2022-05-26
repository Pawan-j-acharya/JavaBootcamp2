package EqualsMethod;

public class Student {
    String name;
    Student(String name)
    {
        this.name=name;
    }
    public boolean equals(Object o)
    {
        Student s=(Student)o;
        if(this.name==s.name)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Student s=new Student(("Pawan"));
        Student s1=new Student("Pawan");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }
}
