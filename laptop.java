public class laptop {
    String brand;
    float price;
    String processor;


    laptop(String brand,float price,String processor){
        this.brand=brand;
        this.price=price;
        this.processor=processor;
    }
    public void coding()
    {
        System.out.println("Coding");
    }
    public void gamimg()
    {
        System.out.println("gaming");
    }

    public static laptop createLaptop(String brand,float price,String processor)
    {
        laptop l=new laptop(brand,price,processor);
        return l;

    }
    public static void main(String[] args)
    {
        laptop l1=createLaptop("acer aspire",49999,"intel");
        laptop l2=createLaptop("asus tuf",59999,"ryzen");
        laptop l3=createLaptop("HP",57999,"ryzen");

//        laptop l1=new laptop("AcerAspire",49999,"intel");
//        laptop l2=new laptop("Asus Tuf",59999,"ryzen");
        System.out.println("------------------laptop 1----------------");
        System.out.println(l1);
        System.out.println(l1.brand);
        System.out.println(l1.price);
        System.out.println(l1.processor);
        l1.coding();
        l1.gamimg();
        System.out.println("------------------laptop 2----------------");
        System.out.println(l2);
        System.out.println(l2.brand);
        System.out.println(l2.price);
        System.out.println(l2.processor);
        l2.coding();
        l2.gamimg();
        System.out.println("------------------laptop 3----------------");
        System.out.println(l3);
        System.out.println(l3.brand);
        System.out.println(l3.price);
        System.out.println(l3.processor);
        l3.coding();
        l3.gamimg();


    }
}
