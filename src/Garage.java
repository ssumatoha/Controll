import java.util.ArrayList;

public class Garage {

    private int maximumCapacity;
    private int ladaCount;
    private int BMWCount;
    private ArrayList<Lada> ladas = new ArrayList<>();
    private ArrayList<BMW> bmws = new ArrayList<>();

    public Garage(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public void addCar(Lada lada) {
        this.ladas.add(lada);
        this.ladaCount += 1;
    }

    public void addCar(BMW bmw) {
        this.bmws.add(bmw);
        this.BMWCount += 1;
    }

    public void getCars() {
        for (Lada i:ladas) {
            System.out.println("Машина: " + i);
        }
        for (BMW i:bmws) {
            System.out.println("Машина: " + i);
        }
    }

}
