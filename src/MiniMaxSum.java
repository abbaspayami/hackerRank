import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(7);
        array.add(69);
        array.add(2);
        array.add(221);
        array.add(8974);
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 5;
//        arr[2] = 3;
//        arr[3] = 7;
//        arr[4] = 9;
        array.sort(Integer::compareTo);
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            sum += array.get(i);

        }
        System.out.println(sum);
        for (int i = array.size() - 1; i > 0; i--) {
            sum1 += array.get(i);

        }
        System.out.println(sum1);

//        IntStream sorted = Arrays.stream(arr).sorted();
//        System.out.println(sorted.limit(arr.length-1).sum());
//        System.out.println(sorted.skip(1).sum());
    }


}
