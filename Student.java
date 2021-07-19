class Student extends Person
{
    int admno;
    Student (String nm , String add , int an)
    {
        super(nm,add);
        admno=an;
    }
    void display()
    {
        System.out.println("Full details of the Person");
        super.display();
        System.out.println("Admission no "+admno);
    }
    /*
    public static void main()
    {
        Student obj = new Student("Ram " , "Kadma ",333);
        obj.display();
    }
    */
}