class Student{

    private String name;
    private String section;
    private Integer rollno;
    private Integer mobno;
    private boolean isoptedforsports;
    private boolean issoptedforbus;

    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.getName();
        this.section = studentBuilder.getSection();
        this.rollno = studentBuilder.getRollno();
        this.isoptedforsports =studentBuilder.isOptedForBus();
        this.issoptedforbus = studentBuilder.IsOptedForSports();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public Integer getMobno() {
        return mobno;
    }

    public void setMobno(Integer mobno) {
        this.mobno = mobno;
    }

    public boolean isoptedforsports() {
        return isoptedforsports;
    }

    public void setoptedforsports(boolean isoptedforsports) {
        this.isoptedforsports = isoptedforsports;
    }

    public boolean isoptedforbus() {
        return issoptedforbus;
    }

    public void setoptedforbus(boolean issoptedforbus) {
        this.issoptedforbus = issoptedforbus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", section='" + section + '\'' +
                ", rollno=" + rollno +
                ", mobno=" + mobno +
                ", isoptedforsports=" + isoptedforsports +
                ", issoptedforbus=" + issoptedforbus +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private String section;
    private Integer rollno;
    private Integer mobno;
    private boolean isoptedforsports;
    private boolean issoptedforbus;

    public StudentBuilder(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRollno() {
        return rollno;
    }

    public StudentBuilder setRollno(Integer rollno) {
        this.rollno = rollno;
        return this;
    }

    public String getSection() {
        return section;
    }

    public StudentBuilder withsection(String section) {
        this.section = section;
        return this;
    }

    public boolean IsOptedForSports() {
        return isoptedforsports;
    }

    public StudentBuilder hasOptedForSports(boolean isoptedforsports) {
        this.isoptedforsports = isoptedforsports;
        return this;
    }

    public boolean isOptedForBus() {
        return issoptedforbus;
    }

    public StudentBuilder hasOptedForBus(boolean optedForNPS) {
        this.issoptedforbus = issoptedforbus;
        return this;
    }

    public Integer Mobileno() {
        return mobno;
    }

    public StudentBuilder withMobileNumber(Integer mobno) {
        this.mobno = mobno;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
public class ex4 {

    public static void main(String[] args) {
        Student student = new StudentBuilder("Puneet",22)
                .withsection("a")
                .hasOptedForSports(true)
                .hasOptedForBus(false)
                .withMobileNumber(39394)
                .build();

        System.out.println(student);
    }

}