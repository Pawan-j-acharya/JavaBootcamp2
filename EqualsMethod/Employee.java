package EqualsMethod;                   //equals method

public class Employee {
    String ename;
    int id;
    Employee(String ename,int id)
    {
        this.ename=ename;
        this.id=id;

    }
    public boolean equals(Object o)
    {
        Employee e=(Employee)o;
        if(this.ename==e.ename && this.id==e.id )           //OR(||) can"t be used
            return true;
        else {
            return false;
        }


    }
    public static void main(String[] args)
    {
        Employee e=new Employee("Pawan",31);
        Employee e1=e;
       // Employee e1=new Employee("Pawan",32);
        Employee e2=new Employee("Pawan",31);
        Employee e3=new Employee("Pawan",31);
        Employee e4=new Employee("Pawan",31);
        System.out.println();
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e==e1);
        System.out.println(e.equals(e1));
        System.out.println();
        System.out.println(e);
        System.out.println(e2);
        System.out.println(e==e2);
        System.out.println(e.equals(e2));
        System.out.println();
        System.out.println(e);
        System.out.println(e3);
        System.out.println(e==e3);
        System.out.println(e.equals(e3));
        System.out.println();
        System.out.println(e);
        System.out.println(e4);
        System.out.println(e==e4);
        System.out.println(e.equals(e4));

    }
}

