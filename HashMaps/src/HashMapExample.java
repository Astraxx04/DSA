import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 99);
        map.put("C", 30);
        map.put("D", 190);
        map.put("E",99);
        System.out.println(map);

        System.out.println(map.containsKey("C"));
        System.out.println(map.get("D"));

        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key +" "+map.get(key));
        }
        map.remove("E");
    }
}
