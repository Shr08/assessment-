import java.util.*;

class Student implements Comparable<Student> {

    public String name;
    public double age;
    public double score;

    public Student(String name, double age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public int compareTo(Student s){
        if(this.score == s.score){
            return 0;
        } else if(this.score < s.score){
            return -1;
        } else {
            return +1;
        }
    }

    public String getName() { return name;}
    public double getAge() { return age;}
    public double getScore() { return score;}
}


class ScoreCompare implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getScore() < s2.getScore()) return -1;
        if (s1.getScore() > s2.getScore()) return 1;
        else return 0;
    }

    class Namecompare implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }
}
public class ex5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Ankita", 23, 76));
        list.add(new Student("Swati", 25, 90));
        list.add(new Student("Ravi", 26, 78));
        list.add(new Student("Sourabh", 21, 76));
        list.add(new Student("Ritesh", 22, 75));
        System.out.println("Sort by score");
        ScoreCompare scoreCompare = new ScoreCompare();
        Collections.sort(list);
        for (Student s : list)
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getScore());
    }
}