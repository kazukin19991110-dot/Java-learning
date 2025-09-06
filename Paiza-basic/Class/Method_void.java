public class Method_void {
    public static void main(String... args) {
        MyfirstClass o1 = new MyfirstClass();
        o1.name = "Kyoko";
        MyfirstClass o2 = new MyfirstClass();
        o2.name = "Rio";

        System.out.println(o1.getName() + "（戻り値ありのメソッド）");
        o2.printName();
    }
}

class MyfirstClass {
    String name;

    //戻り値ありのメソッド
    String getName() {
        return "私の名前は" + name + "です。";
    }
    //戻り値なしのメソッド
    void printName() {
        System.out.println("私の名前は" + name + "です。" + "（戻り値なしのメソッド）");
    }
}