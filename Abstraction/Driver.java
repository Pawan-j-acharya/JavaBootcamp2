package Abstraction;

abstract class A {
    static{
        System.out.println("static multiline initializer ");
    }
    {
        System.out.println("non static multiline initializer ");
    }

    static int a=1;
    int b=2;
   A(int b)
    {
        this.b=b;
    }
    public static void m1()
    {
        System.out.println("m1() executing from class A");
    }
    public static void m2()
    {
        System.out.println("m2() executing from class A");
    }
    public  void m3()
    {
        System.out.println("m3() executing from class A");
    }
    public  void m4()
    {
        System.out.println("m4() executing from class A");
    }
    public abstract void m5();
    public abstract void m6();
}

class B extends A {
    B(int b)
    {
        super(b);
    }
    public void m5() {
        System.out.println("m5() executing from class B");
    }

    public void m6() {
        System.out.println("m6() executing from class B");
    }
}
public class Driver
{
    public static void main(String[] args)
    {
        A x=new B(10);
       System.out.println(x.a);
        System.out.println(x.b);
        x.m1();
        x.m2();
        x.m3();
        x.m4();
        x.m5();
        x.m6();
    }
}


