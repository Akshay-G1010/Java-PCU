class Vehicl
{
    void start()
    {
        System.out.println("This is Vehicle");
    }
}
class Cars1 extends Vehicl
{
    void drive()
    {
        System.out.println("This is Car");
    }
}
class Bike1 extends Vehicl
{
    void ride()
    {
        System.out.println("This is Bike");
    }
}
class Bus extends Vehicl
{
    void pass()
    {
        System.out.println("This is Bus");
    }
}
public class hierarchical_inheritance
{
    public static void main(String[] args)
    {
        Cars1 c=new Cars1();
        c.start();
        c.drive();

        Bike1 b=new Bike1();
        b.start();
        b.ride();

        Bus bu=new Bus();
        bu.start();
        bu.pass();
    }
}