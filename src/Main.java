import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tempList = new ArrayList<>();
        for (int count:intList) {
            if (count > 0 && count % 2 == 0) {
                tempList.add(count);
            }
        }
        tempList.sort(Comparator.naturalOrder());
        for (int count:tempList) {
            System.out.println(count);
        }

    }
}