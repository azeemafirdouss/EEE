import java.util.*;

public class wordFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        
        HashMap<String, Integer> freqMap = new HashMap<>();
        
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
