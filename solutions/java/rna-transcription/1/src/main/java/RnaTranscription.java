import java.util.*;
class RnaTranscription {
    String transcribe(String dnaStrand) {
        if (dnaStrand.equals("")) {
            return "";
        }
        HashMap<String, String> complements = new HashMap<>();
        complements.put("G", "C");
        complements.put("C", "G");
        complements.put("T", "A");
        complements.put("A", "U");

        ArrayList<String> strandList = new ArrayList<>(Arrays.asList(dnaStrand.split("")));
        StringBuilder sb = new StringBuilder("");

        for (String nucleotide: strandList) {
            sb.append(complements.get(nucleotide));
        }
        return sb.toString();
    }

}
