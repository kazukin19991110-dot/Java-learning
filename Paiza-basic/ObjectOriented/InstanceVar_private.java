public class InstanceVar_private {
    public static void main(String... args) {
        Lion l = new Lion();
        l.setJapaneseName("ライオン");
        l.printJapaneseName();
    }
}

class Animal {
    public String japaneseName;
    
    public void setJapaneseName(String n) {
        japaneseName = n;
    }
    
    public String getJapaneseName() {
        return japaneseName;
    }
}

class Lion extends Animal {
    public void printJapaneseName() {
        System.out.println(getJapaneseName());
    }
}