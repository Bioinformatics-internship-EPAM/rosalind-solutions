import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static Map<String, Double> massTable = new HashMap<String, Double>() {{
        put("A", 71.03711);
        put("C", 103.00919);
        put("D", 115.02694);
        put("E", 129.04259);
        put("F", 147.06841);
        put("G", 57.02146);
        put("H", 137.05891);
        put("I", 113.08406);
        put("K", 128.09496);
        put("L", 113.08406);
        put("M", 131.04049);
        put("N", 114.04293);
        put("P", 97.05276);
        put("Q", 128.05858);
        put("R", 156.10111);
        put("S", 87.03203);
        put("T", 101.04768);
        put("V", 99.06841);
        put("W", 186.07931);
        put("Y", 163.06333);
    }};
    public static Map<String, String> codonTable = new HashMap<String, String>() {{
        put("UUU", "F");
        put("CUU", "L");
        put("AUU", "I");
        put("GUU", "V");
        put("UUC", "F");
        put("CUC", "L");
        put("AUC", "I");
        put("GUC", "V");
        put("UUA", "L");
        put("CUA", "L");
        put("AUA", "I");
        put("GUA", "V");
        put("UUG", "L");
        put("CUG", "L");
        put("AUG", "M");
        put("GUG", "V");
        put("UCU", "S");
        put("CCU", "P");
        put("ACU", "T");
        put("GCU", "A");
        put("UCC", "S");
        put("CCC", "P");
        put("ACC", "T");
        put("GCC", "A");
        put("UCA", "S");
        put("CCA", "P");
        put("ACA", "T");
        put("GCA", "A");
        put("UCG", "S");
        put("CCG", "P");
        put("ACG", "T");
        put("GCG", "A");
        put("UAU", "Y");
        put("CAU", "H");
        put("AAU", "N");
        put("GAU", "D");
        put("UAC", "Y");
        put("CAC", "H");
        put("AAC", "N");
        put("GAC", "D");
        put("UAA", "Stop");
        put("CAA", "Q");
        put("AAA", "K");
        put("GAA", "E");
        put("UAG", "Stop");
        put("CAG", "Q");
        put("AAG", "K");
        put("GAG", "E");
        put("UGU", "C");
        put("CGU", "R");
        put("AGU", "S");
        put("GGU", "G");
        put("UGC", "C");
        put("CGC", "R");
        put("AGC", "S");
        put("GGC", "G");
        put("UGA", "Stop");
        put("CGA", "R");
        put("AGA", "R");
        put("GGA", "G");
        put("UGG", "W");
        put("CGG", "R");
        put("AGG", "R");
        put("GGG", "G");
    }};

    public static Map<Character, Character> complementary = Map.of('A', 'T', 'C', 'G', 'G', 'C','T', 'A');

}
