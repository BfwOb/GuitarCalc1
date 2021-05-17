package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stimmungen {

    private static Map<String, String[]> sammleStimmungen;

    static {
        sammleStimmungen = new HashMap<>();
        sammleStimmungen.put("Standard-Tuning", new String[]{"E", "A", "d", "g", "h", "e'"});
        sammleStimmungen.put("Major Thirds", new String[]{"E", "G#", "c", "e", "g#", "c'"});
    }

    public String[] getSaitenBelegung(String stimmung) {
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
