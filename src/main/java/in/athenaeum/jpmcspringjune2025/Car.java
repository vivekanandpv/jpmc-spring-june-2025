package in.athenaeum.jpmcspringjune2025;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car is starting...");
        engine.start();
    }
    
    public void stop() {
        engine.stop();
    }
}
