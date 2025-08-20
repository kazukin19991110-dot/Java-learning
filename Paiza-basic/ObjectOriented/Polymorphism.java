import java.util.ArrayList;

public class Polymorphism {
    public static void main(String... args) {
        Lion l = new Lion();
        Tiger t = new Tiger();

        //ポリモーフィズムの活用
        callBark(l); // Lionのbarkメソッドが呼ばれる
        callBark(t); // Tigerのbarkメソッドが呼ばれる

        Animal a1 = getAnimal(1);
        Animal a2 = getAnimal(2);

        a1.eat("肉");
        a2.eat("魚");

        ArrayList<Animal> al = new ArrayList<>();
        al.add(a1);
        al.add(a2);
        al.forEach(a -> a.bark());
    }

    //メソッドの引数にポリモーフィズムを活用することで
    //型の異なるインスタンスを受け取ることが可能
    public static void callBark(Animal a) {
        a.bark();
    }

    private static Animal getAnimal(int i) {
        return switch(i) {
            case 1 -> new Lion();
            case 2 -> new Tiger();
            default -> new Animal();
        };
    }
}

class Animal {
    public void eat(String food) {
        System.out.println(food + "を食べました");
    }

    public void bark() {
        System.out.println("!");
    }
}

class Lion extends Animal {
    public void bark() {
        System.out.println("!!!");
    }
}

class Tiger extends Animal {
    public void eat(String food) {
        System.out.println("勢いよく" + food + "を食べました");
    }
}