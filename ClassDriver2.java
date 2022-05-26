class D1                    //Method Overriding(without static keyword)
{
    public  void m1()
    {
        System.out.println("m1 of D1");
    }

    public  void m2()
    {
        System.out.println("m2 of D1");
    }

    public  void m3()
    {
        System.out.println("m3 of D1");
    }

    public  void m4()
    {
        System.out.println("m4 of D1");
    }

    public  void m5()
    {
        System.out.println("m5 of D1");
    }
}

class D2 extends D1
{
    public  void m1()
    {
        System.out.println("m1 of D2");
    }

    public  void m2()
    {
        System.out.println("m2 of D2");
    }

    public  void m3()
    {
        System.out.println("m3 of D2");
    }

    public  void m4()
    {
        System.out.println("m4 of D2");
    }

    public  void m5()
    {
        System.out.println("m5 of D2");
    }

}

public class ClassDriver2{
    public static void main(String[] args)
    {
        D2 x=new D2();          //(depends on RHS)
        x.m1();
        x.m2();
        x.m3();
        x.m4();
        x.m5();
        System.out.println();
        D1 y=new D2();         //(depends on RHS)
        y.m1();
        y.m2();
        y.m3();
        y.m4();
        y.m5();


    }
}



