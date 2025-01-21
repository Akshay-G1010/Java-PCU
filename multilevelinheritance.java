class Vehicle
{
    void start()
    {
        System.out.println("This is Vehicle");
    }
}
class car1 extends Vehicle
{
    void drive()
    {
        System.out.println("This is Car");
    }
}
class Bmw extends car1
{
    void boom()
    {
        System.out.println("This is Bmw");
    }
}
public class multilevelinheritance
{
    public static void main(String[] args)
    {
        Bmw l=new Bmw();
        l.start();
        l.drive();
        l.boom();
    }
}