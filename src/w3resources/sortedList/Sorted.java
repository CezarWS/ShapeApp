package w3resources.sortedList;

import java.util.Comparator;

public class Sorted implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
