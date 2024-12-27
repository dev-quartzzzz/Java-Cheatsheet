package data;

public class Person {
    
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void setName(String name)
    {
        this.name =  name;
    }

    protected void setAge(int age)
    {
        this.age = age;
    }

    protected String getName()
    {
        return this.name;
    }
}
