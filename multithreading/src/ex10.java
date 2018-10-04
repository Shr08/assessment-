
import java.util.concurrent.ExecutorService;

public class ex10 {
    public static void main(String[] args) {
        final ExecutorService executor

    }
}
class WorkerThread implements Runnable{
    Counter c;
    public WorkerThread(Counter counter){
        this.c = counter;
    }
    @Override
    public  void run()
    {
        for(int i=0;i<1000;i++)
            c.inc();
    }
}
class Counter{
    static int count =0 ;
    public void inc(){
        count++;
    }
    public int getCount(){
        return this.count;
    }
}