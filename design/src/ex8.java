class Adminn{
    private String name;
    public Adminn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Accessable {
    void access();
}

class Record implements Accessable{
    Adminn admin;
    public Record(Adminn admin) {
        this.admin = admin;
    }

    @Override
    public void access()
    {
        System.out.println("You are Admin, you can access the record.");
    }
}

class Proxy extends Record
{
    public Proxy(Adminn admin) {

        super(admin);
    }

    @Override
    public void access() {
        if(admin.getName().equals("Admin"))
        {
            System.out.println("Allowed");
            super.access();
        }
        else{
            System.out.println("Not allowed to access");
        }

    }

}

public class ex8 {
    public static void main(String[] args)
    {
        Adminn abc=new Adminn("Admin");
        Accessable record = new Proxy(abc);
        record.access();

    }
}