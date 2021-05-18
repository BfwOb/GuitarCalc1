package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Stimmungen {

    private static Map<String, int[]> sammleStimmungen;

    static {
        sammleStimmungen = new HashMap<>();
        sammleStimmungen.put("Standard-Tuning", new int[]{0, 5, 10, 15, 19, 24});
        sammleStimmungen.put("Major Thirds", new int[]{0, 4, 8, 12, 16, 20});
        loadAdditionalTunings();
    }

    private static void loadAdditionalTunings () {
        // CSV-Datei in "records" einlesen
        final String COMMA_DELIMITER = ";";
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Stimmungen/stimmungen.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (List record: records) {
            String bezeichnung = "";
            int[] intervalle = new int[6];
            int x = 0;
            for (Object valCSV: record) {
                if (x == 0) {
                    bezeichnung = valCSV.toString();
                } else {
                    intervalle[x-1] = Integer.valueOf(valCSV.toString());
                }
                x++;
            }
            sammleStimmungen.put(bezeichnung,intervalle.clone());
        }
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
