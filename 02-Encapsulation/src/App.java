import data.ManagePerson;

public class App {
    public static void main(String[] args)
    {
        ManagePerson managePerson = new ManagePerson();
        managePerson.addPerson("Adnin", 22);
        managePerson.addPerson("Rifandi", 23);
        managePerson.addPerson("Sutanto", 24);

        managePerson.setPersonName(0, "Danial");
        managePerson.printPersonName(0);
    }
}
