public class Method_void {
    public static void main(String... args) {
        MyfirstClass o1 = new MyfirstClass();
        o1.name = "Kyoko";

        o1.printName();
    }
}

class MyfirstClass {
    String name;

    String getName() {
        return "私の名前は" + name + "です。";
    }

    void printName() {
        System.out.println("私の名前は" + name + "です。");
    }
}