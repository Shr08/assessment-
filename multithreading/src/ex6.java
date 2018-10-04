import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class MaxValue extends Thread {
    private int low, high;
    private int[] nums;
    private int max = Integer.MIN_VALUE;

    public MaxValue(int[] n, int low, int high) {
        this.nums = n;
        this.low = low;
        this.high = high;
    }

    @Override
    public void run() {
        for (int i = low; i < high; i++) {
            max = Math.max(max, nums[i]);
        }
    }

    public static int findMax(int[] numbers) throws InterruptedException {
        int length = numbers.length;
        int theMax = Integer.MIN_VALUE;
        int n = 4;
        MaxValue[] threads = new MaxValue[n];
        for (int i = 0; i < n; i++) {
            threads[i] = new MaxValue(numbers, (i * length) / n, ((i + 1) * length) / n);
            threads[i].start();
        }
        for (int i = 0; i < n; i++) {
            threads[i].join();
            theMax = Math.max(threads[i].max, theMax);
        }
        return theMax;
    }

    /**
     * @param size:
     *          the size of the desired array
     * @return
     */
    public static int[] populateData(int size) {
        return new Random().ints(size).toArray();
    }
    public static void main(String[] args) {
        try {
            int size = 10;
            int[] numbers = MaxValue.populateData(size);
            int m = MaxValue.findMax(numbers);
            int expected = IntStream.of(numbers).max().getAsInt();
            assert m == expected;
            System.out.println(Arrays.toString(numbers));
            System.out.println("Its max value is: " + m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}