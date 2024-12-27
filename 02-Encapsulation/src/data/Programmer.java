package data;

public class Programmer extends Person {
    private String programmingLanguage;

    public Programmer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

}
