package sample;

import java.util.HashMap;

// Besser als Singleton deklarieren?
public class Toene {

    private static String[] alleToene = {"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/B", "H",
            "c", "c#/db", "d", "d#/eb", "e", "f", "f#/gb", "g", "g#/ab", "a", "a#/b", "h",
            "c'", "c#'/db'", "d'", "d#'/eb'", "e'", "f'", "f#'/gb'", "g'", "g#'/ab'", "a'", "a#'/b'", "h"};


    public Toene() {
    }

    public String[] getAllNotes() {
        return alleToene;
    }

}
