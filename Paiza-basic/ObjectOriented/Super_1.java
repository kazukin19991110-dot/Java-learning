public class Super_1 {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        System.out.println("---");
        Lion l2 = new Lion("ライオン");
    }
}

class Animal {
    public Animal() {
        super();
        System.out.println("Animal()");
    }

    public Animal(String s) {
        super();
        System.out.println("Animal(String)");
    } 
}

class Lion extends Animal {
    public Lion() {
        System.out.println("Lion()");
    }

    public Lion(String s) {
        super(s);
        System.out.println("Lion(String)");
    }
}