package homework090626.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Appliance tv = new Appliance("Հեռուստացույց", "Samsung", 450.0);
        Appliance vacuum = new Appliance("Փոշեկուլ", "Dyson", 300.0);

        ArrayList<Buyer> tvBuyers = new ArrayList<>();
        tvBuyers.add(new Buyer("Արամ Ասատրյան", "2026-05-12", "Երևան, Թումանյան 10"));
        tvBuyers.add(new Buyer("Աննա Սարգսյան", "2026-06-01", "Գյումրի, Շիրակացի 4"));

        ArrayList<Buyer> vacuumBuyers = new ArrayList<>();
        vacuumBuyers.add(new Buyer("Դավիթ Գրիգորյան", "2026-04-20", "Վանաձոր, Տիգրան Մեծի 5"));

        HashMap<Appliance, ArrayList<Buyer>> shopAssoc = new HashMap<>();

        shopAssoc.put(tv, tvBuyers);
        shopAssoc.put(vacuum, vacuumBuyers);

        System.out.println("=== ԽԱՆՈՒԹԻ ՊԱՏՎԵՐՆԵՐԻ ՀԱՄԱԿԱՐԳԻ ԹԵՍՏ ===\n");

        for (Appliance currentAppliance : shopAssoc.keySet()) {
            ArrayList<Buyer> currentBuyers = shopAssoc.get(currentAppliance);
            System.out.println("Տեխնիկա: " + currentAppliance.type);
            System.out.println("Գնորդների քանակը: " + currentBuyers.size());
        }
    }
}
