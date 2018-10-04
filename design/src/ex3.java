enum CarType{
    Micro , Mini, Luxury;
}

enum Location {
    India , UK , China ;
}

abstract class Car {
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.Luxury, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Luxury Car");
    }
}

class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.Mini, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Mini Car");
    }
}

class MicroCar extends Car {

    public MicroCar(Location location) {
        super(CarType.Mini, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Micro Car");
    }
}

class IndianCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Micro:
                car = new MicroCar(Location.India);
                break;
            case Mini:
                car = new MiniCar(Location.India);
                break;
            case Luxury:
                car = new LuxuryCar(Location.India);
                break;
        }
        return car;
    }

}

class UkCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Micro:
                car = new MicroCar(Location.UK);
                break;
            case Mini:
                car = new MiniCar(Location.UK);
                break;
            case Luxury:
                car = new LuxuryCar(Location.UK);
                break;
        }
        return car;
    }

}


class ChinaCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Micro:
                car = new MicroCar(Location.China);
                break;
            case Mini:
                car = new MiniCar(Location.China);
                break;
            case Luxury:
                car = new LuxuryCar(Location.China);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;

    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case India:
                car = IndianCarFactory.buildCar(carType);
                break;
            case China:
                car = ChinaCarFactory.buildCar(carType);
                break;
            case UK:
                car = UkCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}




public class ex3 {
    public static void main(String[] args) {

        System.out.println(
                CarFactory.buildCar(CarType.Micro, Location.UK)
        );

        System.out.println(
                CarFactory.buildCar(CarType.Luxury, Location.India)
        );
    }
}