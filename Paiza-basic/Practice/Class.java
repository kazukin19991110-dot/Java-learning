public class Class {
    public static void main(String[] args) {
        Prac p1 = new Prac();
        Prac p2 = new Prac("#10：仮引数のあるコンストラクタ");
        
        p1.message = "こんにちは(戻り値なし)";
        p1.printMessage(); 

        p1.message = "こんばんわ(戻り値あり)";
        String message1 = p1.getMessage();
        System.out.println(message1);

        //実引数
        p1.printStringValue("おやすみなさい(仮引数あり)");
        p1.printAddInt(5, 10);

        //オーバーロード呼び出し
        p1.printMessage01();

        //static変数呼び出し
        Prac.number = 700;
        System.out.println("#11：" + Prac.number);

        //staticメソッド呼び出し
        Prac.print(813);
    }
}

class Prac {
    String message;

    String getMessage() {
        return message;
    }
    void printMessage() {
        System.out.println(message);
    }

    //仮引数
    void printStringValue(String s) {
        System.out.println(s);
    }
    void printAddInt(int i, int j) {
        System.out.println("引数2つ：" + (i + j));
    }

    //オーバーロード
    void printMessage01(String s) {
        System.out.println(s);
    }
    void printMessage01() {
        printMessage01("おはようございます(オーバーロード)");
        }

    //デフォルトコンストラクタ
    public Prac() {
        System.out.println("#09：デフォルトコンストラクタ");
    }

    //仮引数ありのコンストラクタ
    public Prac(String s) {
        message = s;
        System.out.println(message);
    }

    //static変数
    static int number;

    //staticメソッド
    String name;
    static void print(int i) {
        System.out.println("#12：");
        System.out.println("paiza");
        print(String.valueOf(i)); //文字列へ変換「813 ➡︎ "813"」
    }
    static void print(String s) {
        System.out.println("kirishima");
        System.out.println(s);
    }
}