package TestRK;

interface vehicle
{
    void gearchange(int a);
    void speedup(int a);
    void breaks(int a);
}
class bicycle implements vehicle
{
    int speed,gear;
    public void gearchange(int newgear)
    {
        gear=newgear;
    }
    public void speedup(int increment)
    {
        speed=speed+increment;
    }
    public void breaks(int decrement)
    {
        speed=speed-decrement;
    }
    public void print()
    {
        System.out.println("speed= "+speed);
        System.out.println("gear= "+gear);
    }
}
class car implements vehicle
{
    int speed,gear;
    public void gearchange(int newgear)
    {
        gear=newgear;
    }
    public void speedup(int increment)
    {
        speed=speed+increment;
    }
    public void breaks(int decrement)
    {
        speed=speed-decrement;
    }
    public void print()
    {
        System.out.println("speed= "+speed);
        System.out.println("gear= "+gear);
    }
}

class bike implements vehicle
{
    int speed,gear;
    public void gearchange(int newgear)
    {
        gear=newgear;
    }
    public void speedup(int increment)
    {
        speed=speed+increment;
    }
    public void breaks(int decrement)
    {
        speed=speed-decrement;
    }
    public void print()
    {
        System.out.println("speed= "+speed);
        System.out.println("gear= "+gear);
    }
}

public class Interface
{
	public static void main(String[] args) {

	bicycle b1=new bicycle();
	b1.gearchange(10);
        b1.speedup(10);
        b1.breaks(10);
        b1.print();
        
        car c1=new car();
	c1.gearchange(20);
        c1.speedup(20);
        c1.breaks(20);
        c1.print();
        
        bike b2=new bike();
	b2.gearchange(30);
        b2.speedup(30);
        b2.breaks(30);
        b2.print();
        
	}
}