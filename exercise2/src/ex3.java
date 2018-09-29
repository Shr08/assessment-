public class ex3 {

    public static void main(String args[]) {

        try
        {
            Class.forName("hello");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);;
        }
        greet gr = new greet();
        gr.greeting();
    }

}
/*class greet
{
    void greeting()
    {
        System.out.println("hello!");
    }
}*/

