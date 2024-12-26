class Animal 
{
    String name;

    Animal(String name)
    {
        this.name = name;
    }

    void eat()
    {
        System.out.println(this.name + " is eating.");
    }
}

class Cat extends Animal 
{
    Cat(String name)
    {
        super(name);
    }
}

public class App
{
    public static void main(String[] args) {
        Animal a1 = new Animal("Haru");
        Cat c1 = new Cat("Fubuki");
        a1.eat();
        c1.eat();
        System.err.println(c1.name);
    }
}
