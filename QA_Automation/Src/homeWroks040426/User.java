package homeWroks040426;

public class User {
    public void turnOffAllLights(ResidentialBuilding... buildings) {
        for (ResidentialBuilding b : buildings) {
            b.turnOffLights();
        }
    }
}
