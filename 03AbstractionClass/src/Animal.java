public abstract class Animal {
    String name;
    int age;

    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void eat()
    {
        System.out.println(name + " is eating right now!");
    }

    abstract void drink();

}
