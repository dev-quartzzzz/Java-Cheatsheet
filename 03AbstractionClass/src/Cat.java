public class Cat extends Animal {
    public Cat(String name, int age)
    {
        super(name, age);
    }
    
    @Override
    public void drink()
    {
        System.out.println(name + " is drinking right now.");
    }
}
