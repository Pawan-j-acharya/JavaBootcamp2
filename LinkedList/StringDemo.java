package LinkedList;


import java.util.LinkedList;

public class StringDemo {
    public static void main(String[] args)
    {
        LinkedList LL1=new LinkedList();
        LL1.add(10);
        LL1.add(true);
        LL1.add(10.0);
        LL1.add('c');
        LL1.add("chandan");
        System.out.println("LL1        :"+LL1);

        LL1.remove(2);
        LL1.remove(3);
        System.out.println("remove     :"+LL1);

        LinkedList LL2=new LinkedList();
        LL2.add(10);
        LL2.add(true);
        LL2.add(20.0);
        System.out.println("LL2        :"+LL2);

        LL1.retainAll(LL2);
        System.out.println("retain     :"+LL1);

        LL1.clear();
        System.out.println("clear      :"+LL1);

        LL1.add(10);
        LL1.add(true);
        LL1.add(10.0);
        LL1.add('c');
        LL1.add("chandan");

        LinkedList arr3=new LinkedList();
        arr3=(LinkedList) LL1.clone();
        System.out.println("clone      :"+arr3);

        System.out.println("equals()   :"+LL1.equals(arr3));

        System.out.println("conatains():"+LL1.contains(10));

        System.out.println("size       :"+LL1.size());

        System.out.println("isEmpty()    :"+LL2.isEmpty());

        System.out.println("hashCode   :"+LL1.hashCode());






    }
}
