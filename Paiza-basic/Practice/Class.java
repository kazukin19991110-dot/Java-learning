public class Class {
    public static void main(String[] args) {
        Prac p1 = new Prac();
        Prac p2 = new Prac();
        
        p1.message = "こんにちは(戻り値なし)";
        p1.printMessage(); 

        p2.message = "こんばんわ(戻り値あり)";
        String message1 = p2.getMessage();
        System.out.println(message1);
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
}