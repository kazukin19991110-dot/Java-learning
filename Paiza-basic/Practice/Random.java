import java.util.*;

public class Random {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        //配列を用意
        int[] ArrayNumber = new int[number1];

        //number の要素を ArrayNumber 個読む
        for(int i = 0; i < number1; i++) {
            ArrayNumber[i] = sc.nextInt(); //配列に値を入れる
        }

        System.out.println(number2 + "番目は:" + ArrayNumber[number2 - 1]);
    }
}