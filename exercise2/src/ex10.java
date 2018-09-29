import java.util.LinkedList;
import java.util.Queue;

class Customer extends ex10
{
    int token;
    String food_item;
    int food_price;
    public void order(String item,int price)
    {
        food_item=item;
        food_price=price;
    }

    public int Orderplace() {
        return token;
    }
}
class Cashier extends Customer
{
    int waitTime;
    public int confirmOrder()
    {
        return waitTime ;
    }
    public String orderQueue()
    {
        return food_item;
    }
}
class Barista extends Customer
{
    int orderid;
    Queue q=new LinkedList();
    void nextCust()
    {
        q.peek();
    }
    public void prepare()
    {
        boolean orderReady=true;
        System.out.println("preparing coffee");
        if(orderReady==true)
        {
            System.out.println(token+"Specified token is ready");
        }
        else
        {
            System.out.println("Preparing your item");
        }
    }

}
public class ex10
{
    public static void main(String[] args) {
        ex10 c=new Customer();
        ((Customer) c).Orderplace();
        ex10 d=new Cashier();
        ((Cashier) d).confirmOrder();
        ((Cashier) d).orderQueue();
        ex10 p=new Barista();
        ((Barista) p).prepare();
        System.out.println("Enjoy your coffee");
    }
}