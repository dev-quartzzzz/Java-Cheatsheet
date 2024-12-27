package data;

public class ManagePerson {
    private Person[] persons = new Person[10];
    int numberItem = 0;

    public void addPerson(String name, int age)
    {
        Person person = new Person(name, age);
        this.persons[numberItem] = person;
        numberItem++;
    }

    public void setPersonName(int index, String name)
    {
        this.persons[index].setName(name);
    }

    public void printPersonName(int index)
    {
        System.out.println(this.persons[index].getName());
    }

    public void setPersonAge(int index, int age)
    {
        this.persons[index].setAge(age);
    }

}
