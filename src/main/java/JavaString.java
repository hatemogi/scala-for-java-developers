public class JavaString {
    public static void main(String[] args) {
        System.out.println(
                "Hello, World!".replace("World", "Korea")
        );

        String name = "홍길동";
        final String str = String.format("안녕하세요, %s님!", name); // => "안녕하세요, 홍길동님!"
        final String sum = String.format("1 + 2 = %d", 1 + 2);  // => "1 + 2 = 3"
        System.out.println(str);
        System.out.println(sum);
    }
}
