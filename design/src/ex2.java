package ExDesignpatterns;

interface Polygon {

    void makepolygon();
}

class Triangle implements Polygon{

    @Override
    public void makepolygon() {
        System.out.println("this is a triangle");
    }
}

class Square implements Polygon{

    @Override
    public void makepolygon() {
        System.out.println("this is a Square");

    }
}

class Identifier{
    Polygon polygon;

    public Polygon getPolygon() {
        return polygon;
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }
}

class IdentifierFactory{
    static Identifier getIdentifierObject(String name){
        Identifier identifier= new Identifier();
        switch (name){
            case "Identified Triangle":
                identifier.setPolygon(new Triangle());
                break;
            case "Identified Square" :
                identifier.setPolygon(new Square());
                break;
        }
        return identifier;
    }
}



public class ex2 {
    public static void main(String[] args) {
        Identifier triangle = IdentifierFactory.getIdentifierObject("Identified Triangle");

        triangle.getPolygon().makepolygon();

        Identifier square = IdentifierFactory.getIdentifierObject("Identified Square");

        square.getPolygon().makepolygon();



    }
}