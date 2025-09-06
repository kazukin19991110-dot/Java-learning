public class Method_return {
    public static void main(String... args) {
        MyfirstClass o1 = new MyfirstClass();
        o1.name = "Kyoko";
        MyfirstClass o2 = new MyfirstClass();
        o2.name = "Rio";

        String name1 = o1.getName();
        System.out.println(name1);
        String name2 = o2.getName();
        System.out.println(name2);
    }
}

class MyfirstClass {
    String name;

    String getName() {
        return "私の名前は" + name + "です。";
    }
}