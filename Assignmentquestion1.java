import java.util.HashMap;
import java.util.Map;

public class Assignmentquestion1 {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 15);

        // Check if a key exists
        String keyToCheck = "banana";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the map.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the map.");
        }
    }
}
