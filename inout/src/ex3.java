import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex3 {
    @Override
    public String toString() {
        return "Q3{}";
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("list is "+numbers);
        System.out.println(numbers.stream()
                .filter(e->e%2==0).collect(Collectors.toList()));

    }
}
