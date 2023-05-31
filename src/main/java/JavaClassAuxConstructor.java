public class JavaClassAuxConstructor {

    public class Person {
        public String name;
        public int age;

        // 주 생성자 (primary constructor)
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 인수 없는 생성자
        public Person() {
            this("", 0);
        }

        // 인수 하나 받는 생성자
        public Person(String name) {
            this(name, 0);
        }

        @Override
        public String toString() {
            return String.format("%s님은 %d세입니다.", name, age);
        }
    }

    public void run() {
        System.out.println(new Person("홍길동"));
    }

    public static void main(String[] args) {
        new JavaClassAuxConstructor().run();
    }

}
