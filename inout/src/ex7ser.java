import java.io.*;

public class ex7ser {
    public static void main(String[] args) throws FileNotFoundException {

        try
        {
            Employee employee1 = new Employee("shreya",15000.0,"JVM");
            Employee employee2 = new Employee("rahul",25000.0,"JVM");
            File file = new File("/tmp/employee");
            file.mkdir();
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee/employee.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee1);
            objectOutputStream.flush();
            fileOutputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}

class Employee implements Serializable
{
    private String name;
    private double salary;
    private String competancy;

    public Employee(String name, double salary, String competancy) {
        this.name = name;
        this.salary = salary;
        this.competancy = competancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompetancy() {
        return competancy;
    }

    public void setCompetancy(String competancy) {
        this.competancy = competancy;
    }
}