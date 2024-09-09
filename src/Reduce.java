public class Reduce {
    public static void main(String[] args) {
        int n = 0;
        int start = 100;

        while (start > 0) {
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = start - 1;
            }
            n++;
        }

        System.out.println(n);
    }
}
