public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int upperBound = 1000;
        while (i*3 < upperBound || i*5 < upperBound) {
            if (i*3 < upperBound) {
                System.out.println(i*3);
            }

            if (i*5 < upperBound) {
                System.out.println(i * 5);
            }

            i++;
        }
    }
}
