package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stimmungen {

    private static Map<String, int[]> sammleStimmungen;

    static {
        sammleStimmungen = new HashMap<>();
        sammleStimmungen.put("Standard-Tuning", new int[]{0, 5, 10, 15, 19, 24});
        sammleStimmungen.put("Major Thirds", new int[]{0, 4, 8, 12, 16, 20});
    }

    public int[] getSaitenBelegung(String stimmung) {
        return sammleStimmungen.get(stimmung);
    }

    public String[] getAllTunes() {
        String[] allTunes = new String[sammleStimmungen.size()];
        int i = 0;
        for (String key : sammleStimmungen.keySet()) {
            allTunes[i] = key;
            i++;
        }
        return allTunes;
    }

}
