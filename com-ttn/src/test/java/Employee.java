
public class Employee {
    private String name;
    private Integer age;
    private Integer salary;

    Employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public boolean check()
    {
        if(salary < 50000 && age>18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Employee employee= new Employee("shreya",24,60000);
        System.out.println(employee.check());
    }
}
