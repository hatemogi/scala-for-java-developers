public class JavaClass {

    public class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s님은 %d세입니다.", name, age);
        }
    }

    public void run() {
        System.out.println(new Person("홍길동", 20));
    }

    public static void main(String[] args) {
        new JavaClass().run();
    }
}
