import java.text.SimpleDateFormat;
import java.util.Date;

public class ex8 {
    public static void main(String args[]){

        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(fmt.format(new Date()));
    }
}
