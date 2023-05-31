public class JavaInterface {

    interface Adder {
        default int add(int a, int b) {
            return a + b;
        }
    }

    interface Multiplier {
        default int multiply (int a, int b) {
            return a * b;
        }
    }

    static class JavaMath implements Adder, Multiplier {
        public int add(int a, int b) { return a * b; }
    }

    public static void main(String[] args) {
        JavaMath jm = new JavaMath();
        System.out.println(jm.add(1, 1));
        System.out.println(jm.multiply(2, 2));
    }
}
