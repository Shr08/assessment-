public class ex1 {
    public static void main(String[] args) {
        addInterface add =(a,b)->{ if(a>b) return true; else return false;};
        System.out.println(add.printResults(4,7));
        incrementInterface increment = (a)-> a+1;
        System.out.println(increment.incrementNumber(78));
        concateInterface concate = ((string1, string2) -> string1+string2);
        System.out.println(concate.concateStings("shreya ","girdhar"));
        uppercaseInterface uppercase = (a)-> a.toUpperCase();
        System.out.println(uppercase.convertToUppercase("shreya"));
    }

}

@FunctionalInterface
interface addInterface
{
    Boolean printResults(int a ,int b);
}

@FunctionalInterface
interface incrementInterface
{
    int incrementNumber(int a);
}


@FunctionalInterface
interface concateInterface
{
    String concateStings(String string1, String string2);
}

@FunctionalInterface
interface uppercaseInterface
{
    String convertToUppercase(String string);
}