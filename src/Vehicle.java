public abstract class Vehicle {
    private String _color;
    private String _model;

    Vehicle(String color, String model){
        this._color = color;
        this._model = model;
    }

    abstract void drive();
    abstract void stop();
    abstract void park();

    void horn(){
        System.out.println("Peeeeeep");
    }
}