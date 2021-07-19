// It is the capability of one class to derive proporties from 
//another class
public class Person
{
    String name ;
    String address;
    //constructor function
    Person(String nm , String add)
    {
        name = nm;
        address=add;
    }
    //normal function
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Address "+address);
    }
}
/*Inside the class we have the following
 * (1)variables
 * (2)constructor function
 * (3)normal function
 */