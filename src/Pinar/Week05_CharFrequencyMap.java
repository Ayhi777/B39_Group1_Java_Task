package Pinar;
import java.util.LinkedHashMap;
import java.util.Map;

public class Week05_CharFrequencyMap {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = getFrequencyWithMap(input);
        System.out.println(result);  // A3B2C1D2
    }

    public static String getFrequencyWithMap(String text) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }

        return output.toString();
    }
}
