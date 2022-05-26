package queue;



import java.util.ArrayDeque;
import java.util.ArrayList;


public class Stringdemo {
    public static void main(String[] args)
    {
        ArrayDeque arr1=new ArrayDeque();
        arr1.add(10);
        arr1.add(true);
        arr1.add(10.0);
        arr1.add('c');
        arr1.add("chandan");
        System.out.println("arr1        :"+arr1);

        arr1.remove(10);
        arr1.remove('c');
        System.out.println("arr1        :"+arr1);
        ArrayDeque arr2=new ArrayDeque();
        System.out.println(arr2=arr1.clone());

        ArrayList<Integer> arr3=new <Integer>ArrayList();
        arr3.add(208);
        arr3.add(48);
        arr3.add(84);
        arr3.add(630);
        System.out.println(arr3);














    }
}
