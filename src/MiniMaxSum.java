import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(-1);
        array.add(69);
        array.add(2);
        array.add(221);
        array.add(8974);
        Collections.sort(array);
        long min = 0;
        long max = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            min += array.get(i);
        }
        for (int i = 1; i < array.size(); i++) {
            max += array.get(i);
        }
        System.out.print(min + " " + max);

    }


}
