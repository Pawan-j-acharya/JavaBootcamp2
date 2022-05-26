package Array_List;

import java.util.ArrayList;

public class StringDemo {
    public static void main(String[] args)
    {
        ArrayList arr1=new ArrayList();
        arr1.add(10);
        arr1.add(true);
        arr1.add(10.0);
        arr1.add('c');
        arr1.add("chandan");
        System.out.println("arr1        :"+arr1);

        ArrayList arr2=new ArrayList();
        arr2.add(10);
        arr2.add(true);
        arr2.add(20.0);
        System.out.println("arr2        :"+arr2);

        arr1.remove(2);
        arr1.remove(3);
        System.out.println("remove(arr1):"+arr1);



        arr1.retainAll(arr2);
        System.out.println("retain(arr1):"+arr1);

        arr1.clear();
        System.out.println("clear(arr1) :"+arr1);

        arr1.add(10);
        arr1.add(true);
        arr1.add(10.0);
        arr1.add('c');
        arr1.add("chandan");

        ArrayList arr3=new ArrayList();
        arr3=(ArrayList) arr1.clone();
        System.out.println("clone(arr3) :"+arr3);

        System.out.println("equals()    :"+arr1.equals(arr3));

        System.out.println("conatains() :"+arr1.contains(10));

        System.out.println("size        :"+arr1.size());

        System.out.println("isEmpty()   :"+arr2.isEmpty());

        System.out.println("hashcode    :"+arr1.hashCode());






    }
}
