public class MainClass {

    public static void main(String[] args) {
        Vehicle sportsCar = new Car("White", "McLaren", 0);
        Car testCar= (Car)sportsCar;
        sportsCar.drive();
        sportsCar.stop();
        sportsCar.park();
        sportsCar.horn();
    }
}