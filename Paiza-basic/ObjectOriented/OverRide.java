public class OverRide {
    public static void main(String... args) {
        Lion l = new Lion();
        l.habitat = "アフリカ";
        System.out.println(l.habitat);
        l.eat("肉");
    }
}

class Animal {
    public String habitat;
    public void eat(String food) {
        System.out.println(food + "を食べました");
    }
}

class Lion extends Animal {
    public String habitat;
    public void eat(String food) {
        System.out.println("勢いよく" + food + "を食べました");
    }
}