import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class World {

    public Map Kingdoms = new HashMap();

    public void addKingdom(Kingdom kingdom) {
        Kingdoms.put(kingdom.name, kingdom.getSeniors());
    }

    /*public void war(Kingdom kingdom1, Kingdom kingdom2) {
    }*/
}