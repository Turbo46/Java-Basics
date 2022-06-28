package collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class SearchValue {
    public static void main(String[] args) {

        HashMap<String, Integer> yonkou = new HashMap<>();
        yonkou.put("Monkey D Luffy", 1);
        yonkou.put("Shanks", 2);
        yonkou.put("Lord D Buggy", 3);
        System.out.println("HashMap: " + yonkou);

        Integer value = 3;

        for(Entry<String, Integer> entry: yonkou.entrySet()) {


            if(entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                break;
            }
        }
    }
}