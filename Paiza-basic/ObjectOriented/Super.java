public class Super {
    public static void main(String[] args) {

        // Lion lion = new Lion();
        // lion.test(); 

        (new Lion()).test(); //無名インスタンスを生成してtest()を呼び出す(再利用不可)
    }
}

class Animal {
    public String japaneseName = "動物";

    public void animalMethod() {
        System.out.println("AnimalMethod");
    } 
    public void sleep() {
        System.out.println("Animal zzz...");
    }
}

class Lion extends Animal {
    public String japaneseName = "ライオン";

    public void sleep() {
        System.out.println("Lion zzz...");
    }
    void test() {
        System.out.println(super.japaneseName);
    }
}