import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ex1 {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();
        list.add(new Float(3.15));
        list.add(new Float(4.15));
        list.add(new Float(5.05));
        list.add(new Float(6.05));
        list.add(new Float(7.00));


        Iterator<Float> iterator = list.iterator();

        while (iterator.hasNext()) {
            float i = (float) iterator.next();
            System.out.print(i + ", ");
        }
        System.out.println("\n" + list);
        Iterator<Float> itr = list.iterator();
        {
            int sum = 0;
            for (float i: list) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
