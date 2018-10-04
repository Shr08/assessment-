import java.io.*;

public class ex7des  {
    public static void main(String[] args) {
        Employee employee3=null;
        try
        {
            FileInputStream fileInputStream = new FileInputStream("/tmp/employee/employee.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee3 = (Employee)objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
            System.out.println(employee3.getName());
            System.out. println(employee3.getSalary());
            System.out.println(employee3.getCompetancy());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();

        }
    }
}