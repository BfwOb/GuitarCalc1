package sample;

import java.util.HashMap;

// Besser als Singleton deklarieren?
public class Toene {

    private static String[] alleToene = {"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/B", "H",
            "c", "c#/db", "d", "d#/eb", "e", "f", "f#/gb", "g", "g#/ab", "a", "a#/b", "h",
            "c'", "c#'/db'", "d'", "d#'/eb'", "e'", "f'", "f#'/gb'", "g'", "g#'/ab'", "a'", "a#'/b'", "h'",
            "c''", "c#''/db''", "d''", "d#''/eb''", "e''", "f''", "f#''/gb''", "g''", "g#''/ab''", "a''", "a#''/b''", "h''"};


    public Toene() {
    }

    public String[] getAllNotes() {
        return alleToene;
    }

    public String getNote (int valNote) {
        return alleToene[valNote];
    }

    public int getVal (String note) {
        int valNote = -1;
        for (int i = 0; i < alleToene.length -1; i++) {
            if (alleToene[i].equals(note)) {
                valNote = i;
            }
        }
        return valNote;
    }

}
