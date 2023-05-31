import java.io.IOException;
import java.util.Optional;

public class JavaExceptions {
    void writeTextToFile(String text) throws IOException {

    }

    Optional<Integer> makeInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public void run() {
        String text = "안녕하세요";
        try {
            writeTextToFile(text);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        } finally {
            System.out.println("여기서 리소스 정리");
        }
    }

    public static void main(String[] args) {
        new JavaExceptions().run();
    }
}
