import java.util.Scanner;

public class ex8a {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a string to check");

        String word=s.next();

        while(!(word.equals("done")))
        {
            if(word.charAt(0)==word.charAt(word.length()-1))
            {
                System.out.println("First and last letter of words are same");
            }
            else
            {
                System.out.println("First and last letter are not same");
            }
            word=s.next();
        }

        if(word.equals("done")) {
            System.out.println("done is entered");
        }
    }
}