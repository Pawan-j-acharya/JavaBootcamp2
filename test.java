
 class test {                       //toString method
    String name;
    int usn;
    String branch;
    int age;
    test(String name,int usn,String branch,int age)
    {
        this.name=name;
        this.usn=usn;
        this.branch=branch;
        this.age=age;
    }
    public String toString()
    {
        return "name:"+name+"\nusn:"+usn+"\nbranch:"+branch+"\nage:"+age;
    }

    public static void main(String[] args) {
        test t=new test("pawan",31,"ise",21);
        System.out.println(t);

    }
}
