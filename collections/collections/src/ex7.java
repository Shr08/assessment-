import java.util.Stack;

class NewStack extends Stack<Integer>
{
    Stack<Integer> min = new Stack<>();

    void push(int x)
    {
        if(isEmpty() == true)
        {
            super.push(x);
            min.push(x);
        }
        else
        {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if(x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    public Integer pop()
    {
        //int x = min.pop();
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }
    int getPeek()
    {
        int x = min.peek();
        // min.push(x);
        return x;
    }

    public static void main(String[] args)
    {
        NewStack s = new NewStack();
        s.push(15);
        s.push(2);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Elements after push operation : "+ s);
        s.pop();
        System.out.println("Elements in stack after a pop operation:"+ s);

        System.out.println(" getMin element is: "+ s.getMin());
        System.out.println(" getPeek element :"+s.getPeek());
    }
}