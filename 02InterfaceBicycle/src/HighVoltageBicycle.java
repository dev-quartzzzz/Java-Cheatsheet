public class HighVoltageBicycle implements Bicycle
{
    int speed;

    public HighVoltageBicycle(int speed) 
    {
        this.speed = speed;
    }

    @Override
    public void speedUp(int i)
    {
        speed += i;
    }

    @Override
    public void speedDown(int i)
    {
        speed -= i;
    }

    @Override
    public void brake()
    {
        speed = 0;
    }

}