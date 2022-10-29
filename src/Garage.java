import java.util.ArrayList;

public class Garage {

    private int maximumCapacity;
    private int ladaCount;
    private int BMWCount;
    private ArrayList<Lada> ladas = new ArrayList<>();
    private ArrayList<BMW> bmws = new ArrayList<>();

    public void addCar(Lada lada) {
        this.ladas.add(lada);
    }

    public void addCar(BMW bmw) {
        this.bmws.add(bmw);
    }



}
