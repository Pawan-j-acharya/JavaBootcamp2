//package Collections;
//import java.util.ArrayList;
//import java.util.Scanner;
////--------------------------------------------------swiggy-------------------------------------------------------
//class Swiggy {
//    int  order_no;
//    float price;
//    String location;
//
//    Swiggy(int order_no,float price,String location)
//    {
//        this.order_no=order_no;
//        this.price=price;
//        this.location=location;
//    }
//
//    public String toString()
//    {
//        return "Order No:"+order_no+"\nOrder price:"+price+"\nOrder location:"+location;
//    }
//}
////----------------------------------------------------hotel-----------------------------------------------------
//
//
//
//public class Hotel {
//    int capacity;
//    String hotel_name;
//    String owner_name;
//    Swiggy s;
//    ArrayList<Swiggy> al=new ArrayList();
//    static Scanner sc=new Scanner(System.in);
//
//    Hotel(int capacity,String hotel_name,String owner_name)
//    {
//        this.capacity=capacity;
//        this.hotel_name=hotel_name;
//        this.owner_name=owner_name;
//    }
//
//    public String toString()
//    {
//        return "Hotel capacity:"+capacity+"\nHotel name:"+hotel_name+"\nOwner name:"+owner_name;
//    }
//
//    public void bookOrder()
//    {
//
//        System.out.println("Enter the Order no:");
//        int order_no=sc.nextInt();
//        System.out.println("Enter the Order no:");
//        float price=sc.nextFloat();
//        System.out.println("Enter the Order no:");
//        String location=sc.next();
//        this.s=new Swiggy(order_no,price,location);
//        al.add(s);
//
//    }
//    public void showSwiggyDetails()
//    {
//
//
//        System.out.println(s);
//    }
//    public void showHotelDetails()
//    {
//
//        System.out.println("Hotel capacity:"+capacity);
//        System.out.println("Hotel name:"+hotel_name);;
//        System.out.println("Order name:"+owner_name);
//    }
//    public void cancleOrder()
//    {
//        this.s=null;
//        System.out.println("Order is canceled successfully");
//
//    }
//}
//
////--------------------------------------------Hotel Driver-------------------------------------------------------
//
//
//
//
//class HotelDriver {
//
//    public  static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//        Hotel h = new Hotel(100, "Charcoal", "jigga");
//        boolean exit=true;
//        while(exit) {
//            System.out.println("\n1.Book order\n2.Swiggy details\n3.Hotel Deatils\n4.Cancel order\n5.Exit\nEnter your choice:");
//            int ch =s.nextInt();
//            switch(ch)
//            {
//                case 1:
//                    h.bookOrder();
//                    break;
//                case 2:
//                    h.showSwiggyDetails();
//                    break;
//                case 3:
//                    h.showHotelDetails();
//                    break;
//                case 4:
//                    h.cancleOrder();
//                    break;
//                case 5:
//                    System.exit(0);
//            }
//
//        }
//    }
//}
//
