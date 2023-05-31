public class JavaMethods {

    public int add(int a, int b) {
        return a + b;
    }

    public double triangle(double a, double b) {
        double a2 = a * a;
        double b2 = b * b;
        return Math.sqrt(a2 + b2);
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static void main(String[] args) {
        JavaMethods m = new JavaMethods();
        System.out.println(m.add(2, 3));
        System.out.println(m.triangle(3, 4));
        final int i = 1;
        var j = 2;
        System.out.println(i + j);
        System.out.println(isNullOrEmpty(null));
        System.out.println(isNullOrEmpty("  "));

    }
}
