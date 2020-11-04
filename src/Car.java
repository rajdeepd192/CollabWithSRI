public class Car extends Vehicle {

    private int _doors;

    public Car(String color, String model, int doors) {
        super(color, model);

        try {
            if (doors == 0) {
                throw new InvalidInputException();
            } else {
                this._doors = doors;
            }
        }

        //super(color, model);
        // this._doors = doors;
        catch (InvalidInputException ex) {
            System.out.println("enter valid door number.");
        }
    }


    @Override
    void drive() {
        System.out.println("Car is in drive mode");
    }

    @Override
    void stop() {
        System.out.println("Car is in stop mode");
    }

    @Override
    void park() {
        System.out.println("Car is in park mode");
    }
}