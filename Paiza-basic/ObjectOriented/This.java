public class This {
    public static void main(String[] args) {
        Animal a = new Animal(); //Animalクラスのインスタンス(実体)を作る
        a.printJapaneseName(); //aの中のprint...メソッドを呼び出す
    }
}

class Animal {
    private String japaneseName; //変数を宣言

    public Animal() { 
        this("?");
        System.out.println("-");
    }

    public Animal (String japaneseName) { //文字列を1つ受け取るコンストラクタ
        this.japaneseName = japaneseName; //明示的コンストラクタ呼び出し
    }

    public String getJapaneseName() { //名前を外から取り出す用のメソッド(ゲッター)
        return japaneseName;
    }

    public void printJapaneseName() {
        System.out.println(this.getJapaneseName());
    }
}