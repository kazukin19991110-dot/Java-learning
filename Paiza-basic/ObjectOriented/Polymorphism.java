public class Polymorphism {
    public static void main(String... args) {
        Animal a1 = new Lion();
        Animal a2 = new Tiger();

        a1.eat("肉");
        a1.bark();

        a2.eat("魚");
        a2.bark();
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