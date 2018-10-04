import java.util.function.Supplier;

public class ex2supp {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> {
            return new Person("Shreya", 21, "JVM");
        };
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getCompetancy());

    }

}

class  Person
{
    private String name;
    private int age;
    private String competancy;

    public Person(String name, int age, String competancy) {
        this.name = name;
        this.age = age;
        this.competancy = competancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompetancy() {
        return competancy;
    }

    public void setCompetancy(String competancy) {
        this.competancy = competancy;
    }
}