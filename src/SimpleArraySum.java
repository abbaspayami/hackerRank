public class SimpleArraySum {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

    }
}
