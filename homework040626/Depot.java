package homework040626;

import java.util.ArrayList;
import java.util.List;

public class Depot<T extends Grocery> {
    private final double depotVolume;
    List<T> data = new ArrayList<>();
    private double currentvolumeOfDepot = 0;

    Depot(Double depotVolume) {
        this.depotVolume = depotVolume;
    }

    public Double getDepotVolume() {
        return depotVolume;
    }

    public double getCurrentvolumeOfDepot() {
        return currentvolumeOfDepot;
    }

    public void add(T obj, double kg) {
        currentvolumeOfDepot += (kg * obj.getVolumeOf1Kg());
        if (currentvolumeOfDepot <= depotVolume) {
            data.add(obj);
        }
        else {
            System.out.println("Sum Of Volume Can't Be More Than Depot's Volume");
            return;
        }
    }

    public boolean remove(T obj, double kg) {
        for (int i = 0; i < data.size(); i++) {
            if ( obj == data.get(i) || obj != null && (obj.equals(data.get(i)))) {
                currentvolumeOfDepot-= kg * obj.getVolumeOf1Kg();
                data.remove(data.get(i));
                return true;
            }
        }
        return false;
    }

}
