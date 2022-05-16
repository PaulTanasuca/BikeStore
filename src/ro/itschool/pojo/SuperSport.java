package ro.itschool.pojo;

import java.util.Arrays;

public class SuperSport extends Motorcycle {
    private String[] features;

    public SuperSport() {
    }

    public SuperSport(int id, int price, String model, String manufacturer, int fabricationYear, String[] features) {
        super(id, price, model, manufacturer, fabricationYear);
        this.features = features;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }


    @Override
    public String toString() {
        return "SuperSport{" +
                "id=" + id +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", features=" + Arrays.toString(features) +
                '}';
    }
}
