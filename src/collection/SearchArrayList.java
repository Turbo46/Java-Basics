package collection;

import java.util.ArrayList;
import java.util.List;

public class SearchArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Monkey");
        list_Strings.add("Hippo");
        list_Strings.add("Lion");
        list_Strings.add("Tiger");
        list_Strings.add("Dolphin");

        if (list_Strings.contains("Tiger")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}