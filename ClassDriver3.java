class A {                   //variable Shadowing(both for static and non-static)
    int a=10;
    static int b=20;

}

class B extends A{
    int a=30;
    static int  b=70;

}
class ClassDriver3{
    public static void main(String[] args) {
        System.out.println("with  parent reference as LHS");
        B x = new B();
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println();
        System.out.println("with child reference as LHS");
        A y = new B();
        System.out.println(y.a);
        System.out.println(y.b);
    }

}

