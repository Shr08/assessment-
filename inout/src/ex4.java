import java.util.Arrays;
import java.util.List;

public  class  ex4{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(numbers.stream()
                .filter(e -> e >5)
                .reduce(0, Integer::sum));
    }
}