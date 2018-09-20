public class Main {

    public static void main(String[] args) {
        int max = 1000;
        int digits = 10;
        long count = 0l;
        long maxNum = (long) Math.pow(10, digits);
        for (int i = 1; i <= max; i++) {
            count += calcShortPower(i, maxNum);
            while (count >= 2 * maxNum) {
                count -= maxNum;
            }
        }
        while (count > maxNum)
            count -= maxNum;
        System.out.println(count);
    }

    private static long calcShortPower(int i, long maxNum) {
        int j = i;
        long total = 1l;
        while (j > 0) {
            total *= i;
            while (total >= 2 *maxNum)
                total -= maxNum;
            j--;
        }
        return total;
    }
}
