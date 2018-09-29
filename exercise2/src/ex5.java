
class Student18 implements Cloneable {
    int rollno;
    String name;

    Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ex5 {
    public static void main(String args[]){
        try{
            Student18 s1=new Student18(101,"shreya");
            Student18 s2=(Student18)s1.clone();
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
        }catch(CloneNotSupportedException c){}
        copy c = new copy(10, 15);
        copy c1 = new copy(c);
        System.out.println("Copied values from constructor= " + c1.x + " and " + c1.y);
    }
}
class copy {
    int x,y;

    public copy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    copy(copy C)
    {
        x=C.x;
        y=C.y;
    }

}

