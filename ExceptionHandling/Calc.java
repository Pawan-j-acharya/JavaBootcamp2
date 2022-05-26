package ExceptionHandling;

import java.util.Scanner;
class Calc {
    static float div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two number:");
        int a=s.nextInt();
        int b=s.nextInt();
        float result=div(a,b);
        System.out.println("Division of two number is:"+result);


    }
}
