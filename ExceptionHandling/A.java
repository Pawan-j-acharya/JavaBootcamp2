package ExceptionHandling;

public class A {
    public static void test() {
        int a = 10;
        int b = 0;

        try                                             //try and catch exception handling
        {
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You can't divide a number by zero it gives aithmatic exception !");
        }


        catch(Exception e)     //Exception checks for all type of exception
        {                      //Hence if any any specific exception has to checked first than "Exception" is used in last catch
            System.out.println("You can't divide a number by zero!");
        }




    }
        public static void main(String[] args)
        {
            test();
        }

}
