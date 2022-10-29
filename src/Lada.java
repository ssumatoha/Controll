public class Lada extends Car{

    public Lada(String gearboxType) {
        this.maxSpeed = 150;
        this.currentSpeed = 0;
        this.gearboxType = gearboxType;
        this.price = 200000.0f;
    }

    @Override
    public void start() {
        this.currentSpeed = 20;
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
