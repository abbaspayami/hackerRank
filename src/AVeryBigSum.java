public class AVeryBigSum {
    public static void main(String[] args) {
        Long[] arr = new Long[5];
        arr[0]=1000000001L;
        arr[1]=1000000002L;
        arr[2]=1000000003L;
        arr[3]=1000000004L;
        arr[4]=1000000005L;

        Long sum = 0L;
        for (Long i : arr) {
            sum += i;
        }

        System.out.println(sum);

    }
}
