public class InstanceVarInheritance {
    public static void main(String... args) {
        Yusha Player1 = new Yusha();

        Player1.HP = 200;
        Player1.Attack = 70;

        System.out.println(Player1.HP);
        System.out.println(Player1.Attack);

        Player1.attack("スライム");
    }
}

class Job {
    //　この下にスーパークラスのインスタンス変数を記述する
    public int HP;
    public int Attack;

    // この下にスーパークラスのメソッドを記述する
    public void attack(String target) {
        System.out.println(target + "を攻撃します");
    }
}

class Yusha extends Job {
}