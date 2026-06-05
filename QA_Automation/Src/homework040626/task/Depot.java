package homework040626.task;

public class Depot {

    private final double maxVolume;
    private double currentVolume;

    public Depot(double maxVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = 0.0;
    }

    public void addGrocery(Grocery grocery, double weightKg) {
        double requiredVolume = grocery.getVolumePerKg() * weightKg;

        // aystex stugvum e ardoq ktexavorvi pahestum aydqan apranq te voch
        if (this.currentVolume + requiredVolume > this.maxVolume) {
            System.out.println("Սխալ: Պահեստում բավարար տեղ չկա " + grocery.getName() + "-ի համար:");
        } else {

            this.currentVolume += requiredVolume;
            System.out.println("Added " + weightKg + " kg " + grocery.getName() +
                    ". Occupied volume " + this.currentVolume + "/" + this.maxVolume);
        }
    }

    public void removeGrocery(Grocery grocery, double weightKg) {
        // hashvum enq te inchqan caval petq e azatvi
        double volumeToRemove = grocery.getVolumePerKg() * weightKg;

        // Stugum enq pahestum ardyoq aydqan caval ka te voch
        if (this.currentVolume - volumeToRemove < 0) {
            System.out.println("Error: You cannot withdraw more volume than is available in storage.");
        } else {
            // Pkasacnum enq cavaly
            this.currentVolume -= volumeToRemove;
            System.out.println("Removed " + weightKg + " kg " + grocery.getName() +
                    ". Occupied volume" + this.currentVolume + "/" + this.maxVolume);
        }
    }

    // Getterer yntacik vijaky stugelu hamar
    public double getCurrentVolume() {
        return this.currentVolume;
    }

    public double getMaxVolume() {
        return this.maxVolume;
    }
}
