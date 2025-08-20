import java.util.*;

public class ObjectClass {
    public static void main(String[] args) {
        Object o1 = new Animal();
        Object o2 = new Lion();
        Object o3 = new ArrayList();

        System.out.println(o1.toString());
        System.out.println(o1);

        //equalsメソッド
        Object b1 = new Object();
        Object b2 = b1;
        Object b3 = new Object();

        System.out.println("======================");

        //b1とb2が正しいかどうか
        System.out.println(b1.equals(b2));
        //b1とb3が正しいかどうか
        System.out.println(b1.equals(b3));
    }
}

class Animal extends Object {
    public String toString() {
        return "アニマルクラス";
    }
}

class Lion extends Animal {

}