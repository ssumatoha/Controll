public class BMW extends Car{

    public BMW(String gearboxType) {
        this.maxSpeed = 300;
        this.currentSpeed = 0;
        this.gearboxType = gearboxType;
        this.price = 2000000.0f;
    }

    @Override
    public void start() {
        this.currentSpeed = 50;
    }

    @Override
    public void stop() {
        this.currentSpeed = 0;
    }

    @Override
    public void accelerate(int speed) {
        this.currentSpeed += speed;
    }

}
