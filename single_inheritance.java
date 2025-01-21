class Vehicle1
{
    void start()
    {
        System.out.println("this is Vehicle");
    }
}
class Bike extends Vehicle1
{
    void ride()
    {
        System.out.println("This is bike");
    }
}
public class single_inheritance
{
    public static void main(String[] args)
    {
        Bike bike=new Bike();
        bike.start();
        bike.ride();
    }
}
