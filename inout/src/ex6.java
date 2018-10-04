import java.util.Arrays;
import java.util.List;
public class ex6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("list is "+numbers);
        System.out.println("First even number greater than 3 is ");
        System.out.println(numbers.stream().filter(a->a>3).filter(e->e%2==0).findFirst());
    }
}