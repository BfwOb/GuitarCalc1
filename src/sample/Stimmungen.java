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
    }

    public String[] getSaitenBelegung(String stimmung) {
        String[] saitenBelegung = sammleStimmungen.get(stimmung);
        return saitenBelegung;
    }

}
