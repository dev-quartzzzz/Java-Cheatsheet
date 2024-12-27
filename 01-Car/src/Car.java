public class Car {
    float speed;
    float acceleration;

    public Car() 
    {
        this.speed = 0;
        this.acceleration = 0;
    }

    public Car(float speed)
    {
        this.speed = speed;
        this.acceleration = 0;
    }

    public Car(float speed, float acceleration)
    {
        this.speed = speed;
        this.acceleration = acceleration;
    }
}
