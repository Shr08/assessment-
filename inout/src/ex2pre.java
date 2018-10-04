import java.util.function.Function;
import java.util.function.Predicate;

public class ex2pre {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a)->{return  a>10;};
        System.out.println(predicate.test(5));

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer;
            }
        };
        System.out.println(function.apply(4));
    }
}