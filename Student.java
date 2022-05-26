public class Student {
    String name;
    String usn;
    String branch;
    String year;
    public String toString()
    {
        return "\nStudent name:"+name+"\nusn :"+usn+"\nbranch:"+branch+"\nYear:"+year;
    }
    Student(String name, String usn, String branch,String year){
        this.name=name;
        this.usn=usn;
        this.branch=branch;
        this.year=year;

    }

    public static Student createStudent(String name, String usn, String branch,String year)
    {
        Student s=new Student(name,usn,branch,year);
        return s;
    }

    public void studying()
    {
        System.out.println("STudent is studying");
    }
    public void printStudentAttributes(Student s)
    {
        System.out.println("\nStudent name:"+s.name+"\nusn :"+s.usn+"\nbranch:"+s.branch+"\nYear:"+s.year);
    }
   public static void main(String[] args)
   {
       Student s1=createStudent("Pawan","is031","ise","3-year");
       Student s2=createStudent("jignesh","is039","ise","3-year");
       Student s3=createStudent("yash","is048","ise","2-year");
       s1.printStudentAttributes(s1);
       s1.printStudentAttributes(s2);
       s1.printStudentAttributes(s3);

   }
}
