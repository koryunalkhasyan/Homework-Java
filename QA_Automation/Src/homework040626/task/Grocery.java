package homework040626.task;

public class Grocery {
    private String name;
    private String type;
    private String productionDate;
    private String expirationDate;
    private double volumePerKg; //
    private String manufacturer;

    public Grocery(String name, String type, String productionDate, String expirationDate, double volumePerKg, String manufacturer) {
        this.name = name;
        this.type = type;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
        this.volumePerKg = volumePerKg;
        this.manufacturer = manufacturer;
    }

    public double getVolumePerKg() {
        return this.volumePerKg;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.name + "_" + this.manufacturer;
    }
}